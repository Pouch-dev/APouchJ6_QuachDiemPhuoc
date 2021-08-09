package APouchJ6.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "SanPham")
public class SanPham implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String maSP;
	private String tenSP;
	private Float giaSP;
	private Float giamGia;
	private String kichCo;
	private String moTa;
	private Date createDate = new Date();
	private String hinhAnh;
	private String hinhAnh2;
	private String slideHinh1;
	private String slideHinh2;
	private String slideHinh3;
	private String slideHinh4;
	private String chiTietHinhAnh;
	private Integer soLuongBan;
	private String video;
	private Boolean trangThai;
	private Date ngayTao = new Date();
	
	//loai san pham
	@ManyToOne
	@JoinColumn(name = "maL")
	private LoaiSanPham cate;
	//nhom san pham
	@ManyToOne
	@JoinColumn(name = "maNSP")
	private NhomSanPham groupSP;
	//chi tiet don hang
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<ChiTietDonHang> orderDetails;
}
