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
import APouchJ6.entity.NguoiDung;
import APouchJ6.service.NguoiDungService;

@Service
public class NguoiDungServiceImplement  implements NguoiDungService{
	
	@Autowired
	NguoiDungDAO NDDAO;

	@Override
	public <S extends NguoiDung> S save(S entity) {
		return NDDAO.save(entity);
	}

	@Override
	public <S extends NguoiDung> Optional<S> findOne(Example<S> example) {
		return NDDAO.findOne(example);
	}

	@Override
	public Page<NguoiDung> findAll(Pageable pageable) {
		return NDDAO.findAll(pageable);
	}

	@Override
	public List<NguoiDung> findAll() {
		return NDDAO.findAll();
	}

	@Override
	public List<NguoiDung> findAll(Sort sort) {
		return NDDAO.findAll(sort);
	}

	@Override
	public List<NguoiDung> findAllById(Iterable<String> ids) {
		return NDDAO.findAllById(ids);
	}

	@Override
	public NguoiDung findById(String id) {
		return NDDAO.findById(id).get();
	}

	@Override
	public <S extends NguoiDung> List<S> saveAll(Iterable<S> entities) {
		return NDDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		NDDAO.flush();
	}

	@Override
	public <S extends NguoiDung> S saveAndFlush(S entity) {
		return NDDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(String id) {
		return NDDAO.existsById(id);
	}

	@Override
	public <S extends NguoiDung> List<S> saveAllAndFlush(Iterable<S> entities) {
		return NDDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends NguoiDung> Page<S> findAll(Example<S> example, Pageable pageable) {
		return NDDAO.findAll(example, pageable);
	}

	@Override
	public <S extends NguoiDung> long count(Example<S> example) {
		return NDDAO.count(example);
	}

	@Override
	public <S extends NguoiDung> boolean exists(Example<S> example) {
		return NDDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<NguoiDung> entities) {
		NDDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return NDDAO.count();
	}

	@Override
	public void deleteById(String id) {
		NDDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		NDDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(NguoiDung entity) {
		NDDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		NDDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		NDDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends NguoiDung> entities) {
		NDDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		NDDAO.deleteAll();
	}

	@Override
	public NguoiDung getById(String id) {
		return NDDAO.getById(id);
	}

	@Override
	public <S extends NguoiDung> List<S> findAll(Example<S> example) {
		return NDDAO.findAll(example);
	}

	@Override
	public <S extends NguoiDung> List<S> findAll(Example<S> example, Sort sort) {
		return NDDAO.findAll(example, sort);
	}

	@Override
	public List<NguoiDung> getAdministrator() {
		return NDDAO.getAdministrator();
	}
	
	
}
