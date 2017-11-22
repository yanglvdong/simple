package org.yd.springdemo.util;

import java.util.Properties;
import java.util.function.Supplier;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;
/**
 * 注释生成器
 * @author Administrator
 *
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

	private boolean suppressAllComments;
	
	private boolean addRemarkComments;
	
	public void addConfigurationProperties(Properties properties){
		super.addConfigurationProperties(properties);
		
		suppressAllComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		addRemarkComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
		
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if(suppressAllComments){
			return;
		}
		field.addJavaDocLine("/**");
		String remarks = introspectedColumn.getRemarks();
		if(addRemarkComments && StringUtility.stringHasValue(remarks)){
			String[] remarkLines = remarks.split(System.getProperty("line.separator"));
			for (String remarkLine : remarkLines) {
				field.addJavaDocLine(" * " + remarkLine);
			}
		}
		//field.addJavaDocLine(" * " + introspectedColumn.getActualColumnName());
		field.addJavaDocLine(" */");
	}
	
	
}
