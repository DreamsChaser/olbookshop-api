package cn.com.njit.wd.api.dto;

import java.io.Serializable;

/**
 * Created by wangdi on 2017/3/29.
 */
public class EmpDTO implements Serializable{

    private static final long serialVersionUID = -8544768074229928257L;
    private String empId;
    private String empName;
    private String empAge;
    private String empGender;

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmpDTO{" +
                "empAge='" + empAge + '\'' +
                ", empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                '}';
    }
}
