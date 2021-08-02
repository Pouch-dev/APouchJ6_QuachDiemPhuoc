package APouchJ6.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
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
@Table(name = "NhomSanPham")
public class NhomSanPham implements Serializable{
	
	@Id
	private String maNhom;
	private String tenNhom;
	
	//loai san pham
	@JsonIgnore
	@OneToMany(mappedBy = "groupL")
	private List<LoaiSanPham> groupCates;
	//loai san pham
	@JsonIgnore
	@OneToMany(mappedBy = "groupSP")
	private List<SanPham> groupPd;

}
