package com.example.Student.Management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Students {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String name;

        private String address;

        private String rollNo;

        public Students(){
                super();
        }

        @Override
        public String toString() {
                return "Students{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", rollNo='" + rollNo + '\'' +
                        '}';
        }
}



