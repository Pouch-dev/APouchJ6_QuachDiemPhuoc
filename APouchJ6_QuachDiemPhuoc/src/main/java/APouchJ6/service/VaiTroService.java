package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.VaiTro;

public interface VaiTroService {

	<S extends VaiTro> List<S> findAll(Example<S> example, Sort sort);

	<S extends VaiTro> List<S> findAll(Example<S> example);

	VaiTro getById(String id);

	void deleteAll();

	void deleteAll(Iterable<? extends VaiTro> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends String> ids);

	void delete(VaiTro entity);

	void deleteAllByIdInBatch(Iterable<String> ids);

	void deleteById(String id);

	long count();

	void deleteAllInBatch(Iterable<VaiTro> entities);

	<S extends VaiTro> boolean exists(Example<S> example);

	<S extends VaiTro> long count(Example<S> example);

	<S extends VaiTro> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends VaiTro> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(String id);

	<S extends VaiTro> S saveAndFlush(S entity);

	void flush();

	<S extends VaiTro> List<S> saveAll(Iterable<S> entities);

	VaiTro findById(String id);

	List<VaiTro> findAllById(Iterable<String> ids);

	List<VaiTro> findAll(Sort sort);

	List<VaiTro> findAll();

	Page<VaiTro> findAll(Pageable pageable);

	<S extends VaiTro> Optional<S> findOne(Example<S> example);

	<S extends VaiTro> S save(S entity);

}
