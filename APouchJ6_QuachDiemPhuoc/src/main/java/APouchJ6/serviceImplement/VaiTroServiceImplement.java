package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import APouchJ6.dao.VaiTroDAO;
import APouchJ6.entity.VaiTro;
import APouchJ6.service.VaiTroService;

@Service
public class VaiTroServiceImplement implements VaiTroService{
	@Autowired
	VaiTroDAO VTDAO;

	@Override
	public <S extends VaiTro> S save(S entity) {
		return VTDAO.save(entity);
	}

	@Override
	public <S extends VaiTro> Optional<S> findOne(Example<S> example) {
		return VTDAO.findOne(example);
	}

	@Override
	public Page<VaiTro> findAll(Pageable pageable) {
		return VTDAO.findAll(pageable);
	}

	@Override
	public List<VaiTro> findAll() {
		return VTDAO.findAll();
	}

	@Override
	public List<VaiTro> findAll(Sort sort) {
		return VTDAO.findAll(sort);
	}

	@Override
	public List<VaiTro> findAllById(Iterable<String> ids) {
		return VTDAO.findAllById(ids);
	}

	@Override
	public VaiTro findById(String id) {
		return VTDAO.findById(id).get();
	}

	@Override
	public <S extends VaiTro> List<S> saveAll(Iterable<S> entities) {
		return VTDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		VTDAO.flush();
	}

	@Override
	public <S extends VaiTro> S saveAndFlush(S entity) {
		return VTDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(String id) {
		return VTDAO.existsById(id);
	}

	@Override
	public <S extends VaiTro> List<S> saveAllAndFlush(Iterable<S> entities) {
		return VTDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends VaiTro> Page<S> findAll(Example<S> example, Pageable pageable) {
		return VTDAO.findAll(example, pageable);
	}

	@Override
	public <S extends VaiTro> long count(Example<S> example) {
		return VTDAO.count(example);
	}

	@Override
	public <S extends VaiTro> boolean exists(Example<S> example) {
		return VTDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<VaiTro> entities) {
		VTDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return VTDAO.count();
	}

	@Override
	public void deleteById(String id) {
		VTDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		VTDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(VaiTro entity) {
		VTDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		VTDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		VTDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends VaiTro> entities) {
		VTDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		VTDAO.deleteAll();
	}

	@Override
	public VaiTro getById(String id) {
		return VTDAO.getById(id);
	}

	@Override
	public <S extends VaiTro> List<S> findAll(Example<S> example) {
		return VTDAO.findAll(example);
	}

	@Override
	public <S extends VaiTro> List<S> findAll(Example<S> example, Sort sort) {
		return VTDAO.findAll(example, sort);
	}
	
	
}
