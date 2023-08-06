package web.emp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Dept {
	@Id
	 	private Integer deptno;
	    private String dname;
	    private String loc;
	    
	    
	    //一對多 對應emp
//	    @OneToMany       //MYSQL資料庫裡顯示欄位名稱            //MYSQL資料庫裡顯示欄位名稱
//	    @JoinColumn(name="DEPTNO", referencedColumnName = "DEPTNO")
//	    private List<Emp>emps;
	    
	    //雙向1對n
	    @OneToMany(mappedBy = "dept")
	    private List<Emp>emps;
	    
}