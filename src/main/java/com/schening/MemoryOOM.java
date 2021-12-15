package com.schening;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenchen
 * @version 1.0
 * @date 2021/11/30 6:53 下午
 */
public class MemoryOOM {

    public static void main(String[] args) {
        MemoryOOM memoryOOM = new MemoryOOM();
        try {
            memoryOOM.syncApplication();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Person> syncApplication() throws InterruptedException {
        List<Person> personList = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("开始执行：" + i);
                personList.add(new Person(i, "Jack" + i, 18));
            }
//            Thread.sleep(1000);
        }
    }

    class Person {

        private Integer id;

        private String name;

        private Integer age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

}
