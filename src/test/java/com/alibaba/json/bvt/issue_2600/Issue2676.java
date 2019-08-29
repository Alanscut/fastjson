package com.alibaba.json.bvt.issue_2600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Issue2676 extends TestCase {

	public void test_for_issue() throws Exception {

		VO vo = new VO();
		vo.setName("test");
		vo.setAge(25);
		String json = JSON.toJSONString(vo);
		assertEquals("{\"age\":25,'name':'test'}", json);
    }

	class VO {
		
		@JSONField(serialzeFeatures = {SerializerFeature.UseSingleQuotes})
		private String name;

		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
	}
}
