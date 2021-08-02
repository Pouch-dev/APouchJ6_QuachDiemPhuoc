package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.LoaiSanPham;

public interface LoaiSanPhamService {

	<S extends LoaiSanPham> List<S> findAll(Example<S> example, Sort sort);

	<S extends LoaiSanPham> List<S> findAll(Example<S> example);

	LoaiSanPham getById(String id);

	void deleteAll();

	void deleteAll(Iterable<? extends LoaiSanPham> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends String> ids);

	void delete(LoaiSanPham entity);

	void deleteAllByIdInBatch(Iterable<String> ids);

	void deleteById(String id);

	long count();

	void deleteAllInBatch(Iterable<LoaiSanPham> entities);

	<S extends LoaiSanPham> boolean exists(Example<S> example);

	<S extends LoaiSanPham> long count(Example<S> example);

	<S extends LoaiSanPham> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends LoaiSanPham> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(String id);

	<S extends LoaiSanPham> S saveAndFlush(S entity);

	void flush();

	<S extends LoaiSanPham> List<S> saveAll(Iterable<S> entities);

	Optional<LoaiSanPham> findById(String id);

	List<LoaiSanPham> findAllById(Iterable<String> ids);

	List<LoaiSanPham> findAll(Sort sort);

	List<LoaiSanPham> findAll();

	Page<LoaiSanPham> findAll(Pageable pageable);

	<S extends LoaiSanPham> Optional<S> findOne(Example<S> example);

	<S extends LoaiSanPham> S save(S entity);

}
