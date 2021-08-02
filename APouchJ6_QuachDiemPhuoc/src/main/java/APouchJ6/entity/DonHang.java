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
@Table(name = "DonHang")
public class DonHang implements Serializable{
	
	
	@Id
	private Long maDH;
	@ManyToOne
	@JoinColumn(name="maND")
	private NguoiDung customer;
	private String diaChi;
	private Integer trangThai;
	@JsonIgnore
	@OneToMany(mappedBy = "orders")
	private List<ChiTietDonHang> chitiet;
}
