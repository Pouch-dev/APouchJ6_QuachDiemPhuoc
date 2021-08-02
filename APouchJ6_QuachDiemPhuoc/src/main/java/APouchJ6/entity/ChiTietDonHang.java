package APouchJ6.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ChiTietDonHang")
public class ChiTietDonHang implements Serializable{
	
	
	@Id
	private Long maCTDH;
	private Double gia;
	private Integer soLuong;
	@ManyToOne
	@JoinColumn(name="idSP")
	private SanPham product;
	@ManyToOne
	@JoinColumn(name="maDH")
	private DonHang orders;
}
