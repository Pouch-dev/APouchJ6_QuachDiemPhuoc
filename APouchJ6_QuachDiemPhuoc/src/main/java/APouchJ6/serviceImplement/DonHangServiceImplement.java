package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import APouchJ6.dao.ChiTietDonHangDAO;
import APouchJ6.dao.DonHangDAO;
import APouchJ6.entity.ChiTietDonHang;
import APouchJ6.entity.DonHang;
import APouchJ6.service.DonHangService;

@Service
public class DonHangServiceImplement  implements DonHangService{
	
	@Autowired
	DonHangDAO DHDAO;
	@Autowired
	ChiTietDonHangDAO CTDH;

	@Override
	public <S extends DonHang> S save(S entity) {
		return DHDAO.save(entity);
	}

	@Override
	public <S extends DonHang> Optional<S> findOne(Example<S> example) {
		return DHDAO.findOne(example);
	}

	@Override
	public Page<DonHang> findAll(Pageable pageable) {
		return DHDAO.findAll(pageable);
	}

	@Override
	public List<DonHang> findAll() {
		return DHDAO.findAll();
	}

	@Override
	public List<DonHang> findAll(Sort sort) {
		return DHDAO.findAll(sort);
	}

	@Override
	public List<DonHang> findAllById(Iterable<Long> ids) {
		return DHDAO.findAllById(ids);
	}

	@Override
	public DonHang findById(Long id) {
		return DHDAO.findById(id).get();
	}

	@Override
	public <S extends DonHang> List<S> saveAll(Iterable<S> entities) {
		return DHDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		DHDAO.flush();
	}

	@Override
	public <S extends DonHang> S saveAndFlush(S entity) {
		return DHDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return DHDAO.existsById(id);
	}

	@Override
	public <S extends DonHang> List<S> saveAllAndFlush(Iterable<S> entities) {
		return DHDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends DonHang> Page<S> findAll(Example<S> example, Pageable pageable) {
		return DHDAO.findAll(example, pageable);
	}

	@Override
	public <S extends DonHang> long count(Example<S> example) {
		return DHDAO.count(example);
	}

	@Override
	public <S extends DonHang> boolean exists(Example<S> example) {
		return DHDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<DonHang> entities) {
		DHDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return DHDAO.count();
	}

	@Override
	public void deleteById(Long id) {
		DHDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		DHDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(DonHang entity) {
		DHDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		DHDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		DHDAO.deleteAllInBatch();
	}
	@Override
	public void deleteAll(Iterable<? extends DonHang> entities) {
		DHDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		DHDAO.deleteAll();
	}

	@Override
	public DonHang getById(Long id) {
		return DHDAO.getById(id);
	}

	@Override
	public <S extends DonHang> List<S> findAll(Example<S> example) {
		return DHDAO.findAll(example);
	}

	@Override
	public <S extends DonHang> List<S> findAll(Example<S> example, Sort sort) {
		return DHDAO.findAll(example, sort);
	}

	@Override
	public DonHang create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		
		DonHang order = mapper.convertValue(orderData, DonHang.class);
		DHDAO.save(order);
		
		TypeReference<List<ChiTietDonHang>> type = new TypeReference<List<ChiTietDonHang>>() {};
		List<ChiTietDonHang> details = mapper.convertValue(orderData.get("orderDetails"), type)
		 	.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		CTDH.saveAll(details);
		return order;
	}

	@Override
	public List<Object> findByUser(String username) {
		return DHDAO.findByUsername(username);
	}

	
}
