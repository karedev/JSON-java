package org.json;

/**
 * Beans that support customized output of JSON text shall implement this interface.  
 * @author FangYidong[fangyidong@yahoo.com.cn]
 */
public interface JSONAware {
	/**
         * Gets the JSON string value
         * 
	 * @return JSON text
	 */
	String toJSONString();
}
