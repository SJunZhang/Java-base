package reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FieldTest {
	public static void main(String[] args) {
		Person p1 = new Person(12, "admin");

		try {
			Field filed_name = p1.getClass().getDeclaredField("name");
			filed_name.setAccessible(true);
			filed_name.get(p1);
			System.out.println(filed_name.get(p1).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// String [] resultArr = getNullFields(p1);
		// System.out.println(Arrays.toString(resultArr));

	}

	/**
	 * 判断实例obj的为空的所有属性集合。
	 * 
	 * @param obj
	 * @return
	 */
	private static String[] getNullFieldsSetByScanAllFields(Object obj) {
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

}

class Person {
	private Integer age;
	private String name;
	private String addresser;
	private Date birthday;

	public Person(Integer age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddresser() {
		return addresser;
	}

	public void setAddresser(String addresser) {
		this.addresser = addresser;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
