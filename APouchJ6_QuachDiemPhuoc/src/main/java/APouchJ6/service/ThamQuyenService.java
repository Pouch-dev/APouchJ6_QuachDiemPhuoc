package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.ThamQuyen;

public interface ThamQuyenService {

	<S extends ThamQuyen> List<S> findAll(Example<S> example, Sort sort);

	<S extends ThamQuyen> List<S> findAll(Example<S> example);

	ThamQuyen getById(Integer id);

	void deleteAll();

	void deleteAll(Iterable<? extends ThamQuyen> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(ThamQuyen entity);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	void deleteById(Integer id);

	long count();

	void deleteAllInBatch(Iterable<ThamQuyen> entities);

	<S extends ThamQuyen> boolean exists(Example<S> example);

	<S extends ThamQuyen> long count(Example<S> example);

	<S extends ThamQuyen> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ThamQuyen> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Integer id);

	<S extends ThamQuyen> S saveAndFlush(S entity);

	void flush();

	<S extends ThamQuyen> List<S> saveAll(Iterable<S> entities);

	ThamQuyen findById(Integer id);

	List<ThamQuyen> findAllById(Iterable<Integer> ids);

	List<ThamQuyen> findAll(Sort sort);

	List<ThamQuyen> findAll();

	Page<ThamQuyen> findAll(Pageable pageable);

	<S extends ThamQuyen> Optional<S> findOne(Example<S> example);

	<S extends ThamQuyen> S save(S entity);

	List<ThamQuyen> findAuthoritiesOfAdministrators();

	ThamQuyen create(ThamQuyen auth);

	void delete(Integer id);

}
