package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import APouchJ6.dao.NguoiDungDAO;
import APouchJ6.dao.ThamQuyenDAO;
import APouchJ6.entity.NguoiDung;
import APouchJ6.entity.ThamQuyen;
import APouchJ6.service.ThamQuyenService;

@Service
public class ThamQuyenServiceImplement implements ThamQuyenService{
	
	@Autowired
	ThamQuyenDAO TQDAO;
	@Autowired
	NguoiDungDAO NDDAO;

	@Override
	public <S extends ThamQuyen> S save(S entity) {
		return TQDAO.save(entity);
	}

	@Override
	public <S extends ThamQuyen> Optional<S> findOne(Example<S> example) {
		return TQDAO.findOne(example);
	}

	@Override
	public Page<ThamQuyen> findAll(Pageable pageable) {
		return TQDAO.findAll(pageable);
	}

	@Override
	public List<ThamQuyen> findAll() {
		return TQDAO.findAll();
	}

	@Override
	public List<ThamQuyen> findAll(Sort sort) {
		return TQDAO.findAll(sort);
	}

	@Override
	public List<ThamQuyen> findAllById(Iterable<Integer> ids) {
		return TQDAO.findAllById(ids);
	}

	@Override
	public ThamQuyen findById(Integer id) {
		return TQDAO.findById(id).get();
	}

	@Override
	public <S extends ThamQuyen> List<S> saveAll(Iterable<S> entities) {
		return TQDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		TQDAO.flush();
	}

	@Override
	public <S extends ThamQuyen> S saveAndFlush(S entity) {
		return TQDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return TQDAO.existsById(id);
	}

	@Override
	public <S extends ThamQuyen> List<S> saveAllAndFlush(Iterable<S> entities) {
		return TQDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends ThamQuyen> Page<S> findAll(Example<S> example, Pageable pageable) {
		return TQDAO.findAll(example, pageable);
	}

	@Override
	public <S extends ThamQuyen> long count(Example<S> example) {
		return TQDAO.count(example);
	}

	@Override
	public <S extends ThamQuyen> boolean exists(Example<S> example) {
		return TQDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<ThamQuyen> entities) {
		TQDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return TQDAO.count();
	}

	@Override
	public void deleteById(Integer id) {
		TQDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		TQDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(ThamQuyen entity) {
		TQDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		TQDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		TQDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends ThamQuyen> entities) {
		TQDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		TQDAO.deleteAll();
	}

	@Override
	public ThamQuyen getById(Integer id) {
		return TQDAO.getById(id);
	}

	@Override
	public <S extends ThamQuyen> List<S> findAll(Example<S> example) {
		return TQDAO.findAll(example);
	}

	@Override
	public <S extends ThamQuyen> List<S> findAll(Example<S> example, Sort sort) {
		return TQDAO.findAll(example, sort);
	}

	@Override
	public List<ThamQuyen> findAuthoritiesOfAdministrators() {
		List<NguoiDung> accounts = NDDAO.getAdministrator();
		return TQDAO.authoritiesOf(accounts);
	}

	@Override
	public ThamQuyen create(ThamQuyen auth) {
		return TQDAO.save(auth);
	}

	@Override
	public void delete(Integer id) {
		TQDAO.deleteById(id);
	}
	
	
}
