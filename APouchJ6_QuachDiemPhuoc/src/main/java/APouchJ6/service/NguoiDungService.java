package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.NguoiDung;

public interface NguoiDungService {

	<S extends NguoiDung> List<S> findAll(Example<S> example, Sort sort);

	<S extends NguoiDung> List<S> findAll(Example<S> example);

	NguoiDung getById(String id);

	void deleteAll();

	void deleteAll(Iterable<? extends NguoiDung> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends String> ids);

	void delete(NguoiDung entity);

	void deleteAllByIdInBatch(Iterable<String> ids);

	void deleteById(String id);

	long count();

	void deleteAllInBatch(Iterable<NguoiDung> entities);

	<S extends NguoiDung> boolean exists(Example<S> example);

	<S extends NguoiDung> long count(Example<S> example);

	<S extends NguoiDung> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends NguoiDung> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(String id);

	<S extends NguoiDung> S saveAndFlush(S entity);

	void flush();

	<S extends NguoiDung> List<S> saveAll(Iterable<S> entities);

	NguoiDung findById(String id);

	List<NguoiDung> findAllById(Iterable<String> ids);

	List<NguoiDung> findAll(Sort sort);

	List<NguoiDung> findAll();

	Page<NguoiDung> findAll(Pageable pageable);

	<S extends NguoiDung> Optional<S> findOne(Example<S> example);

	<S extends NguoiDung> S save(S entity);

	List<NguoiDung> getAdministrator();
	
}
