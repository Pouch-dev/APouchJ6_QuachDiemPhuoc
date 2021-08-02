package APouchJ6.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NguoiDung")
public class NguoiDung implements Serializable{
	
	@Id
	private String tenTK;
	private String matKhau;
	private String hoTen;
	private	String Email;
	private String hinhAnh;
	private String diaChi;
	private Integer soDT;
	private Boolean trangThai;
	
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan", fetch = FetchType.EAGER) //Quan Trọng ko được thiếu *fetch = FetchType.EAGER*
	List<ThamQuyen> maTK;
}
