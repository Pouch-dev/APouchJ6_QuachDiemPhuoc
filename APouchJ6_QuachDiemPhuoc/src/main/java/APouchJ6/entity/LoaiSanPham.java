package APouchJ6.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LoaiSanPham")
public class LoaiSanPham implements Serializable{
	
	@Id
	private String maLoai;
	private String tenLoai;
	private String ghiChu;
	//san pham
	@JsonIgnore
	@OneToMany(mappedBy = "cate")
	private List<SanPham> product;
	//nhom san pham
	@ManyToOne
	@JoinColumn(name = "maNSP")
	private NhomSanPham groupL;
}
