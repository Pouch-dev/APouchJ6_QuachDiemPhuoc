package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.NhomSanPham;

public interface NhomSanPhamService {

	<S extends NhomSanPham> List<S> findAll(Example<S> example, Sort sort);

	<S extends NhomSanPham> List<S> findAll(Example<S> example);

	NhomSanPham getById(String id);

	void deleteAll();

	void deleteAll(Iterable<? extends NhomSanPham> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends String> ids);

	void delete(NhomSanPham entity);

	void deleteAllByIdInBatch(Iterable<String> ids);

	void deleteById(String id);

	long count();

	void deleteAllInBatch(Iterable<NhomSanPham> entities);

	<S extends NhomSanPham> boolean exists(Example<S> example);

	<S extends NhomSanPham> long count(Example<S> example);

	<S extends NhomSanPham> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends NhomSanPham> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(String id);

	<S extends NhomSanPham> S saveAndFlush(S entity);

	void flush();

	<S extends NhomSanPham> List<S> saveAll(Iterable<S> entities);

	Optional<NhomSanPham> findById(String id);

	List<NhomSanPham> findAllById(Iterable<String> ids);

	List<NhomSanPham> findAll(Sort sort);

	List<NhomSanPham> findAll();

	Page<NhomSanPham> findAll(Pageable pageable);

	<S extends NhomSanPham> Optional<S> findOne(Example<S> example);

	<S extends NhomSanPham> S save(S entity);

}
