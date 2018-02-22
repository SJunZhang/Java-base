package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description:反射关于Field的工具类
 * @author zsj
 * @date 2018年1月23日 下午8:14:31
 */
public class FieldsUtil {
	/**
	 * 判断实例obj的为空的所有属性集合。
	 * 
	 * @param obj
	 * @return
	 */
	public static String[] getNullFieldsSetByScanAllFields(Object obj) {
		List<String> nullValueFieldList = new ArrayList<String>();// 定义一个list存储值为空的属性。
		String fieldName = "";
		// 对实例obj的所有Field就行遍历
		for (Field f : obj.getClass().getDeclaredFields()) {
			try {
				f.setAccessible(true);// true时允许访问私有变量，false时不允许通过反射访问该字段
				fieldName = f.getName();
				if (f.get(obj) == null) { // 判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
					nullValueFieldList.add(fieldName);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String[] fieldNullValueResultList = new String[nullValueFieldList.size()];
		for (int j = 0; j < nullValueFieldList.size(); j++) {
			fieldNullValueResultList[j] = nullValueFieldList.get(j);
		}
		return fieldNullValueResultList;
	}

	/**
	 * 遍历查询出实例obj,在指定输入的fields数组中为空的属性集合。
	 * 
	 * @param fields
	 * @param obj
	 * @return
	 */
	public static String[] getNullFieldsSetByScanInputFields(String[] fields, Object obj) {
		List<String> nullValueFieldList = new ArrayList<String>();
		Field field = null;
		String fieldName = "";
		for (int i = 0; i < fields.length; i++) {
			fieldName = fields[i];
			try {
				// 通过属性名获取属性Field对象
				field = obj.getClass().getDeclaredField(fieldName);
				field.setAccessible(true);
				if (field.get(obj) == null) {
					nullValueFieldList.add(fieldName);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String[] fieldNullValueResultList = new String[nullValueFieldList.size()];

		for (int j = 0; j < nullValueFieldList.size(); j++) {
			fieldNullValueResultList[j] = nullValueFieldList.get(j);
		}
		return fieldNullValueResultList;
	}

	/**
	 * 
	 * 获取对象属性，返回一个字符串数组
	 * 
	 * @param o对象
	 * @return String[] 字符串数组
	 */
	private static String[] getFiledName(Object o) {
		try {
			Field[] fields = o.getClass().getDeclaredFields();
			String[] fieldNames = new String[fields.length];
			for (int i = 0; i < fields.length; i++) {
				fieldNames[i] = fields[i].getName();
			}
			return fieldNames;
		} catch (SecurityException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		return null;

	}

	/**
	 * 
	 * 使用反射根据属性名称获取属性值
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param o
	 *            操作对象
	 * @return Object 属性值
	 */
	public static Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(o, new Object[] {});
			return value;
		} catch (Exception e) {
			System.out.println("属性不存在");
			return null;
		}
	}

}
