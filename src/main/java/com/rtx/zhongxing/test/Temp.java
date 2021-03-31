package com.rtx.zhongxing.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.rtx.zhongxing.bean.qm.entryorder.EntryOrderDTO;
import com.rtx.zhongxing.utils.JaxbObjectAndXmlUtil;

@SuppressWarnings("all")
public class Temp {

	public static void main(String[] args) throws Exception {
//		test();
//		test1();
//		createSeq();
//		File file = new File("D:\\interfaceproject\\zhongxing\\rtx_zhongxing_api\\src\\main\\java\\com\\rtx\\zhongxing\\dao\\jpa\\entity");
//		modifyFile(file);
//		replaceFile();
//		sort();
//		testxml();
		testObject();
	}
	
	public static void testObject() {
		System.out.println(Object.class.getDeclaredFields().length);
	}
	
	public static void testxml() throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ren\\Desktop\\中兴书店奇门xml\\入库单创建接口"));
		while(reader.ready()) {
			sb.append(reader.readLine());
		}
		EntryOrderDTO apiEntity = JaxbObjectAndXmlUtil.xml2Object(sb.toString(), EntryOrderDTO.class);
		System.out.println(JSON.toJSONString(apiEntity));
	}
	
	public static void sort(Map<String,Object>map) {
		StringBuffer sb = new StringBuffer();
		List<String> sortarray = new ArrayList<String>();
		String[] keys = map.keySet().toArray(new String[0]);
		int length = map.keySet().size();
		for(int i=0;i<length;i++) {
			String current = keys[i];
			int index = 0;
			index = i+1;
			for(int j =(i+1);j<(length-i);j++) {
				String next = keys[j];
//				current = compare(current,next,j);
				int minlength = current.length() < next.length()?current.length():next.length();
				for(int k=0;k<minlength;k++) {
					int currentASCII = current.charAt(i);
					int nextASCII = next.charAt(i);
					if(currentASCII<nextASCII) {
//						keys[i] = 
					}
				}
			}
			keys[i] =current;
			keys[index]="";
		}
		System.out.println(sb.toString());
	}
	
	public static String compare(String str1,String str2,int index) {
		String minvalue = "";
		int length = str1.length()<=str2.length()?str1.length():str2.length();
		for(int i = 0;i<length;i++) {
			int ASCII1 = str1.charAt(i);
			int ASCII2 = str2.charAt(i);
			if(ASCII1 != ASCII2) {
				if(ASCII1<ASCII2) {
					minvalue=str1;
					index=index;
				}else {
					minvalue=str2;
				}
				break;
			}
		}
		return minvalue;
	}
	
	public static void replaceFile() throws Exception {
		List<String> tableName = new ArrayList<String>();
		File file = new File("D:\\interfaceproject\\zhongxing\\rtx_zhongxing_api\\src\\main\\java\\com\\rtx\\zhongxing\\dao\\jpa\\entity");
		List<File> allFile = new ArrayList<File>();
		getAllFile(file,allFile);
		int index = 0;
		for(File temp:allFile) {
			StringBuffer sb = new StringBuffer();
			BufferedReader reader = new BufferedReader(new FileReader(temp));
			while(reader.ready()) {
				String tempStr = reader.readLine();
				sb.append(tempStr.replaceAll("zhongxing","zhongxing")+"\r\n");
			}
			FileOutputStream out = new FileOutputStream(temp);
			System.out.println(sb.toString());
			out.write(sb.toString().getBytes());
			out.flush();
			out.close();
		}
	}
	
	public static void test2() throws Exception {
		
	}
	
	public static void createSeq() throws Exception {
		List<String> tableName = new ArrayList<String>();
		File file = new File("D:\\interfaceproject\\zhongxing\\rtx_zhongxing_api\\src\\main\\java\\com\\rtx\\zhongxing\\dao\\jpa\\entity");
		List<File> allFile = new ArrayList<File>();
		getAllFile(file,allFile);
		
		String pattern ="@Table\\(name = \"\\S+\"\\)";
		Pattern r = Pattern.compile(pattern);
		for(File filetemp:allFile) {
			StringBuffer sb = new StringBuffer();
			BufferedReader reader = new BufferedReader(new FileReader(filetemp));
			while(reader.ready()) {
				sb.append(reader.readLine());
			}
			Matcher m = r.matcher(sb.toString());
			if(m.find()) {
//				System.out.println("drop table "+m.group(0).replace("@Table(name = \"", "").replace("\")", "")+";");
				tableName.add(m.group(0).replace("@Table(name = \"", "").replace("\")", ""));
			}
		}
		
		for(String tablename:tableName) {
			String str = 
//					"\r\n" + 
//					"create sequence "+tablename+"_seq\r\n" + 
//					"minvalue 1\r\n" + 
//					"maxvalue 999999999999999999999999999999\r\n" + 
//					"start with 1\r\n" + 
//					"increment by 1\r\n" + 
//					"cache 20;\r\n" + 
//					"/\r\n" ;
					"CREATE OR REPLACE TRIGGER "+tablename+"_TRIGGER BEFORE INSERT ON "+tablename+" FOR EACH ROW\r\n" + 
					"DECLARE\r\n" + 
					"  BEGIN\r\n" + 
					"    IF :NEW.SERIALKEY IS NULL THEN\r\n" + 
					"      SELECT "+tablename+"_SEQ.NEXTVAL\r\n" + 
					"      INTO   :NEW.SerialKey\r\n" + 
					"      FROM   dual;\r\n" + 
					"        END IF;\r\n" + 
					"  END;\r\n" + 
					"/";
			System.out.println(str);
		}
	}
	
	public static void getAllFile(File file,List<File> allFile) {
		if(file.isDirectory()) {
			for(File filetemp:file.listFiles()) {
				getAllFile(filetemp,allFile);
			}
		}else {
			allFile.add(file);
		}
	}
	
	public static void modifyFile(File file) throws Exception {
		if(file.isDirectory()) {
			for(File filetemp:file.listFiles()) {
				modifyFile(filetemp);
			}
		}else {
			
			Pattern p = Pattern.compile("@Table\\(name = \"\\S+\"\\)");
			Pattern p2 = Pattern.compile("^}$");
			StringBuffer sb = new StringBuffer();
			BufferedReader reader = new BufferedReader(new FileReader(file));
			int serialkeyline  = 0;
			int importaddline = 0;
			String tablename = "";
			while(reader.ready()) {
				String tempLine = reader.readLine();
				Matcher matcher = p.matcher(tempLine);
				Matcher matend = p2.matcher(tempLine);
				if(matcher.find()) {
					serialkeyline = 1;
					tablename = matcher.group(0).replace("@Table(name = \"", "").replace("\")", "");
				}
				
				if(serialkeyline == 3) {
					sb.append("	@Id\r\n" + 
							"	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = \""+tablename+"_seq\")\r\n" + 
							"	@SequenceGenerator(name = \""+tablename+"_seq\",initialValue = 1,allocationSize = 1,sequenceName = \""+tablename+"_seq\")\r\n" + 
							"	private Long serialkey;");
					
				}
				if(importaddline ==1) {
					sb.append("import javax.persistence.GeneratedValue;\r\n" + 
							"import javax.persistence.GenerationType;\r\n" + 
							"import javax.persistence.Id;\r\n" + 
							"import javax.persistence.SequenceGenerator;");
				}
				
				if(matend.find()) {
					sb.append("	public Long getSerialkey() {\r\n" + 
							"		return serialkey;\r\n" + 
							"	}\r\n" + 
							"\r\n" + 
							"	public void setSerialkey(Long serialkey) {\r\n" + 
							"		this.serialkey = serialkey;\r\n" + 
							"	}\r\n");
				}
				
				sb.append(tempLine+"\r\n");
				if(serialkeyline > 0) {
					serialkeyline ++;
				}
				importaddline++;
			}
			System.out.println(sb.toString());
			
			FileOutputStream out = new FileOutputStream(file);
			out.write(sb.toString().getBytes());
			out.flush();
			out.close();
		}
	}
	

	
}
