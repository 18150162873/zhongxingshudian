package com.rtx.zhongxing.utils;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class JaxbObjectAndXmlUtil {
	   /**
     * @param xmlStr 字符串
     * @param c 对象Class类型
     * @return 对象实例
     */
    @SuppressWarnings("unchecked")
    public static <T> T xml2Object(String xmlStr,Class<T> c){ 
        try{ 
	        JAXBContext context = JAXBContext.newInstance(c); 
	        Unmarshaller unmarshaller = context.createUnmarshaller(); 
	        T t = (T) unmarshaller.unmarshal(new StringReader(xmlStr)); 
	        return t; 
        } catch (JAXBException e) {  
        	e.printStackTrace();  
        	return null; 
        } 
    } 
       
    /**
     * @param object 对象
     * @return 返回xmlStr
     */
    public static String object2Xml(Object object){ 
    	StringWriter writer = null;
        try{  
        	writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass()); 
            Marshaller  marshal = context.createMarshaller();
            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化输出 
            marshal.setProperty(Marshaller.JAXB_ENCODING,"utf-8" );// 编码格式,默认为utf-8 
            marshal.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xml头信息 
            marshal.setProperty("jaxb.encoding", "utf-8"); 
            marshal.marshal(object,writer);
            return new String(writer.getBuffer());
        } catch (Exception e) { 
        	e.printStackTrace(); 
        	return null;
        } finally{
        	try {
        		if(writer != null)
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        } 
    } 
	public static Element getRoot(String filepath) {
		Element root = null;
		try {
			SAXReader reader = new SAXReader();
			// 获取文件节点
			Document doc = reader.read(filepath);
			root = doc.getRootElement(); // 得到根节点
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return root;
	}
}
