package APouchJ6.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GioHang")
public class GioHang implements Serializable{
	
	@Id
	private Integer maSP;
	private String tenSP;
	private Float giaSP;
	private Float giamGia;
	private String kichCo;
	private String hinhAnh;
	
}
