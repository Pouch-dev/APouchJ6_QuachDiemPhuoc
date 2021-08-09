package APouchJ6.service;

import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.databind.JsonNode;

import APouchJ6.entity.DonHang;

public interface DonHangService {

	DonHang create(JsonNode orderData);

	<S extends DonHang> List<S> findAll(Example<S> example, Sort sort);

	<S extends DonHang> List<S> findAll(Example<S> example);

	DonHang getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends DonHang> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(DonHang entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<DonHang> entities);

	<S extends DonHang> boolean exists(Example<S> example);

	<S extends DonHang> long count(Example<S> example);

	<S extends DonHang> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends DonHang> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends DonHang> S saveAndFlush(S entity);

	void flush();

	<S extends DonHang> List<S> saveAll(Iterable<S> entities);

	DonHang findById(Long id);

	List<DonHang> findAllById(Iterable<Long> ids);

	List<DonHang> findAll(Sort sort);

	List<DonHang> findAll();

	Page<DonHang> findAll(Pageable pageable);

	<S extends DonHang> Optional<S> findOne(Example<S> example);

	<S extends DonHang> S save(S entity);

	List<Object> findByUser(String username);

}
