package com.rtx.zhongxing.test.codehelp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class QMCodeHelp {


	public static void main(String[] args) throws Exception {
		String xmlpath = "C:\\Users\\ren\\Desktop\\中兴书店奇门xml\\订单取消接口";
		String packageName = "com.rtx.zhongxing.bean.qm.ordercancel";
		String packagePath = "D:\\interfaceproject\\zhongxing\\rtx_zhongxing_api\\src\\main\\java\\com\\rtx\\zhongxing\\bean\\qm\\ordercancel";
//		xmlRead(xmlpath,packageName,packagePath);
		showTableMappingJavaBeanFile("RECEIPTDETAIL");
//		showTbaleMappingInserMybatisSql("RECEIPT");
	}
	
	public static void createDynamicInsertSql(Class clazz,String tableName) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("<script> insert into "+tableName+"");
		
		StringBuffer valueSb = new StringBuffer();
		StringBuffer mapperValueSb = new StringBuffer();
		Field[] fieldArray = clazz.getDeclaredFields();
		
		sb.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >");
		for(Field field:fieldArray) {
			if(List.class.equals(field.getType())) {
				continue;
			}
			String fieldName = field.getName().toLowerCase();
			valueSb.append("<if test=\""+fieldName+" != null\" >");
			valueSb.append(field.getName()+",");
			valueSb.append("</if>");
			
			mapperValueSb.append("<if test=\""+fieldName+" != null\" >");
			mapperValueSb.append("#{"+fieldName+"},");
			mapperValueSb.append("</if>");
		}
		sb.append(valueSb);
		sb.append("</trim>");
		
		sb.append("<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >");
		sb.append(mapperValueSb);
		sb.append("</trim> </script> ");
		
		System.out.println(sb.toString());
		OutputStream out = new FileOutputStream(new File("C:\\Users\\ren\\Desktop\\import\\sad.log"));
		out.write(sb.toString().getBytes());
		out.close();
	}
	
	
	public static void createUpdateInsertSql(Class clazz,String tableName) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("update "+tableName+" ");
		
		StringBuffer valueSb = new StringBuffer();
		StringBuffer mapperValueSb = new StringBuffer();
		Field[] fieldArray = clazz.getDeclaredFields();
		
		sb.append("<set >");
		for(Field field:fieldArray) {
			String fieldName = field.getName().toLowerCase();
			valueSb.append("<if test=\""+fieldName+" != null\" >");
			valueSb.append(""+fieldName+" = #{"+fieldName+"},");
			valueSb.append("</if>");
		}
		sb.append(valueSb);
		sb.append("</set>");
		sb.append("where serialkey = #{serialkey}");
		
		System.out.println(sb.toString());
		OutputStream out = new FileOutputStream(new File("C:\\Users\\ren\\Desktop\\import\\sad.log"));
		out.write(sb.toString().getBytes());
		out.close();
	}
	
	public static void showNewSqlModifySqlCode(String packageFilePath,String tableName,String sqlcolnum,String mapperColnum) {
		try {
			File file = new File(packageFilePath);
			List<File> list = new ArrayList<File>();
			getAllFile(file,list);
			for(File tempFile:list) {
				StringBuffer sb = new StringBuffer();
				boolean isMapper = false;
				BufferedReader reader = new BufferedReader(new FileReader(tempFile));
				int i = 1;
				while(reader.ready()) {
					String line = reader.readLine();
					if(line.contains(tableName)&&line.contains("@insert")&line.contains("values")) {
						String lin1 = line.split("values")[0].split("\\)")[0];
						String lin2 = line.split("values")[1].split("\\)\"\\)")[0];
						String newLine = lin1+","+sqlcolnum+")values"+lin2+","+mapperColnum+"\\\")\"";
						sb.append(newLine);
						System.out.println("行号："+i);
						System.out.println(newLine);
						i++;
					}
//					String absoluteFile = tempFile.getAbsolutePath();
//					tempFile.renameTo(new File(absoluteFile+".bak"));
//					File newFile = new File(absoluteFile);
//					newFile.createNewFile();
//					OutputStream out = new FileOutputStream(newFile);
//					out.write(sb.toString().getBytes());
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getAllFile(File file ,List<File> fileList) {
		if(file.isDirectory()) {
			File[] fileArray = file.listFiles();
			for(File field:fileArray) {
				getAllFile(field,fileList);
			}
		}else {
			fileList.add(file);
			return;
		}
	}
	
	//
	public static void readField() throws Exception {
		XSSFWorkbook workBook = new XSSFWorkbook(new File("C:\\Users\\ren\\Desktop\\import\\az.xlsx"));
		XSSFSheet sheet =workBook.getSheetAt(3);
		String change = "";
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			XSSFRow row = sheet.getRow(i);
			String fileName = row.getCell(0).getStringCellValue();
			String type = row.getCell(2).getStringCellValue();
			//			Pattern pa = Pattern.compile("\\S+\\(");
			//			Matcher matcher = pa.matcher(type);
			//			if(matcher.find()) {
			type = type.replaceAll("\\(\\S+\\)", "");
			if("double".equals(type)) {
				type = "Double";
			}else if("Short".equals(type)||"number".equals(type)) {
				type = "double";
			}else if("datetime".equals(type)) {
				type = "Date";
			}else if("Tinyint".equals(type)) {
				type = "int";
			}else if("Varchar".equals(type)) {
				type = "String";
			}else {
				type ="String";
			}
			
			String desc = row.getCell(3).getStringCellValue();
			if(fileName.indexOf("->")<0) {
				continue;
			}
			if(!change.equals(fileName.split("->")[0])){
				change = fileName.split("->")[0];
				System.err.println(change);
			};
			if(!"".equals(fileName)) {
//				System.out.println("@JSONField(name = \""+jsonStr+"\")");
				System.out.println("private "+type+" "+fileName.split("->")[1]+"; //"+desc);
			}
		}
	}
	
	public static void xmlRead(String path,String packageName,String packagePath) throws Exception {
//		File file = new File("C:\\Users\\ren\\Desktop\\import\\jb");
		File file = new File(path);
		BufferedReader read = new BufferedReader(new FileReader(file));
		StringBuffer sb = new StringBuffer();
		while(read.ready()) {
			sb.append(read.readLine());
		}
		Document document = DocumentHelper.parseText(sb.toString());
		Element element = document.getRootElement();
//		String packagePath ="D:\\interfaceproject\\rtx_jb_api\\rtx_jb_api\\src\\main\\java\\com\\rtx\\jb\\receipt\\bean";
//		String Package = "com.rtx.jb.receipt.bean.qm.request";
		String Package = packageName;
//		String basepath = "C:\\Users\\ren\\Desktop\\import\\bean\\receipt";
//		String basepath = "D:\\interfaceproject\\rtx_jb_api\\rtx_jb_api\\src\\main\\java\\com\\rtx\\jb\\receipt\\bean\\qm\\request";
		String basepath = packagePath;
		FileWriter fo =new FileWriter(new File(basepath+File.separator+element.getName()+".java"));
		createBean(element.elements(),fo,basepath,Package,element.getName());
		fo.close();
	}
	
	public static void createBean(List<Element> elementList,FileWriter fout,String basepath,String Package,String oname) throws Exception {
		StringBuffer centext = new StringBuffer();
		List<String> fieldList = new LinkedList<String>();
		List<String> importList = new LinkedList<String>();
		List<String> accsessList = new LinkedList<String>();
		for(Element element:elementList) {
			
			if(element.elements().size()>0) {
				String name = element.getName().substring(0, 1).toUpperCase()+element.getName().substring(1);
				fieldList.add("	private "+name+" "+element.getName()+";\n");
				importList.add("import "+Package+"."+name+";\n");
				
				accsessList.add("	public "+name+" get"+name+"() {\r\n" + 
						"		return "+element.getName()+";\r\n" + 
						"	}\n");
				accsessList.add("	public void set"+name+"("+name+" "+element.getName()+") {\r\n" + 
						"		this."+element.getName()+" = "+element.getName()+";\r\n" + 
						"	}\n");
				FileWriter fo =new FileWriter(new File(basepath+File.separator+element.getName().substring(0, 1).toUpperCase()+element.getName().substring(1)+".java"));
				createBean(element.elements(),fo,basepath,Package,element.getName());
				fo.close();
			}else {
				String desc = element.getText();
				accsessList.add("	public String get"+element.getName()+"() {\r\n" + 
						"		return "+element.getName()+";\r\n" + 
						"	}\n");
				accsessList.add("	public void set"+element.getName()+"(String "+element.getName()+") {\r\n" + 
						"		this."+element.getName()+" = "+element.getName()+";\r\n" + 
						"	}\n");
				fieldList.add("	private String "+element.getName()+";//"+desc+"\n");
			}
//			fout.write(field);
		}
		centext.append("package "+Package+";\r\n" );
		for(String im:importList) {
			centext.append(im);
		}
		centext.append("public class "+oname.substring(0, 1).toUpperCase()+oname.substring(1)+" {\n");
		for(String im:fieldList) {
			centext.append(im);
		}
		for(String im:accsessList) {
			centext.append(im);
		}
		centext.append("\n}");
		fout.write(centext.toString());
	}
	
	public static void showTbaleMappingInserMybatisSql(String tableName) throws IOException{
		List<TableMetadata> list = queryTableMetadata(tableName);
		StringBuffer sb = new StringBuffer();
		StringBuffer test = new StringBuffer();
		sb.append("insert into "+tableName+"(");
		test.append("insert into "+tableName+"(");
		List<String> dbField = new ArrayList<String>();
		List<String> mybatisField = new ArrayList<String>();
		List<String> testValue = new ArrayList<String>();
		for(TableMetadata metadata:list) {
			String type = metadata.getData_type();
			String colname = metadata.getColumn_name().trim().toLowerCase();
			if("serialkey".equals(colname)||"addwho".equals(colname)||"editwho".equals(colname)) {
				continue;
			}
			if("DATE".equals(type)) {
				type = "Date";
				continue;
			}
			if("NUMBER".equals(type)) {
				dbField.add(colname);
				mybatisField.add("#{"+colname+"}");
				testValue.add("'1.00'");
			}else {
				dbField.add(colname);
				mybatisField.add("#{"+colname+",javaType=string,jdbcType=VARCHAR}");
				testValue.add("'test'");
			}
		}
		sb.append(dbField.stream().collect(Collectors.joining(","))+")values(");
		sb.append(mybatisField.stream().collect(Collectors.joining(","))+")");
		
		test.append(dbField.stream().collect(Collectors.joining(","))+")values(");
		test.append(testValue.stream().collect(Collectors.joining(","))+")");
		System.out.println(sb.toString());
		OutputStream out = new FileOutputStream(new File("C:\\Users\\ren\\Desktop\\import\\sad.log"));
		out.write(sb.toString().getBytes());
		out.close();
//		System.err.println(test.toString());
	}
	
	public static void showTableMappingJavaBeanFile(String tableName) throws IOException {
		List<TableMetadata> list = queryTableMetadata(tableName);
		for(TableMetadata metadata:list) {
			String type = metadata.getData_type();
			
			if("DATE".equals(type)) {
				type = "Date";
			}else if("NUMBER".equals(type)) {
				type = "double";
			}else {
				type = "String";
			}
			
			if("serialkey".equals(metadata.getColumn_name().toLowerCase())) {
				continue;
			}
			if(metadata.getColumn_name().contains("$")) {
				continue;
			}
			System.out.println("private "+type+" "+metadata.getColumn_name().toLowerCase()+";");
		}
	}
	
	public static List<TableMetadata> queryTableMetadata(String tableName) throws IOException {
		SqlSession sqlsession = getsqlsession();
		CodeHelpMapper codeHelp =  sqlsession.getMapper(CodeHelpMapper.class);
		return codeHelp.queryByTableName(tableName.toUpperCase());
	}
	
	public static SqlSession getsqlsession() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlsession = factory.openSession();
		return sqlsession;
	}
	
	/**
	 * 对比新旧中间表差异
	 */
	public static void showDiffFieldByOldAndNew(boolean modfiyCode,List<String> newFieldList,Class midClass,String tableName,String packageFieldPath){
		List<String> oldList = Arrays.asList(midClass.getDeclaredFields()).stream().map(field->field.getName().toLowerCase()).collect(Collectors.toList());
		
		List<String> toAddFieldList = new ArrayList<String>();
		for(String newField:newFieldList) {
			if(!oldList.contains(newField)) {
				toAddFieldList.add(newField);
			}
		}
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for(String toadd:toAddFieldList) {
			sb1.append("private String "+toadd+";\n");
			sb2.append("alter table "+tableName+" add "+ toadd+" nvarchar2(50);\n");
			
		}
		System.err.println(sb1.toString());
		
//		toAddFieldList.forEach(System.out::println);
		
		System.out.println(sb2.toString());
		
		String sqlcolnum = toAddFieldList.stream().collect(Collectors.joining(","));
		String mapperColnum = toAddFieldList.stream().map(str->"#{"+str+",javaType=string,jdbcType=VARCHAR}").collect(Collectors.joining(","));
		
		System.out.println(sqlcolnum);
		System.out.println(mapperColnum);
		
		if(modfiyCode) {
			showNewSqlModifySqlCode(packageFieldPath,tableName,sqlcolnum,mapperColnum);
		}
	}
}
