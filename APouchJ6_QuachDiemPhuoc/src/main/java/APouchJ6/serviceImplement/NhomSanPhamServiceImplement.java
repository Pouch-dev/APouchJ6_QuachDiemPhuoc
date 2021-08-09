package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import APouchJ6.dao.NhomSanPhamDAO;
import APouchJ6.entity.NhomSanPham;
import APouchJ6.service.NhomSanPhamService;

@Service
public class NhomSanPhamServiceImplement  implements NhomSanPhamService{
	
	@Autowired
	NhomSanPhamDAO NSPDAO;

	@Override
	public <S extends NhomSanPham> S save(S entity) {
		return NSPDAO.save(entity);
	}

	@Override
	public <S extends NhomSanPham> Optional<S> findOne(Example<S> example) {
		return NSPDAO.findOne(example);
	}

	@Override
	public Page<NhomSanPham> findAll(Pageable pageable) {
		return NSPDAO.findAll(pageable);
	}

	@Override
	public List<NhomSanPham> findAll() {
		return NSPDAO.findAll();
	}

	@Override
	public List<NhomSanPham> findAll(Sort sort) {
		return NSPDAO.findAll(sort);
	}

	@Override
	public List<NhomSanPham> findAllById(Iterable<String> ids) {
		return NSPDAO.findAllById(ids);
	}

	@Override
	public NhomSanPham findById(String id) {
		return NSPDAO.findById(id).get();
	}

	@Override
	public <S extends NhomSanPham> List<S> saveAll(Iterable<S> entities) {
		return NSPDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		NSPDAO.flush();
	}

	@Override
	public <S extends NhomSanPham> S saveAndFlush(S entity) {
		return NSPDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(String id) {
		return NSPDAO.existsById(id);
	}

	@Override
	public <S extends NhomSanPham> List<S> saveAllAndFlush(Iterable<S> entities) {
		return NSPDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends NhomSanPham> Page<S> findAll(Example<S> example, Pageable pageable) {
		return NSPDAO.findAll(example, pageable);
	}

	@Override
	public <S extends NhomSanPham> long count(Example<S> example) {
		return NSPDAO.count(example);
	}

	@Override
	public <S extends NhomSanPham> boolean exists(Example<S> example) {
		return NSPDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<NhomSanPham> entities) {
		NSPDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return NSPDAO.count();
	}

	@Override
	public void deleteById(String id) {
		NSPDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		NSPDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(NhomSanPham entity) {
		NSPDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		NSPDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		NSPDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends NhomSanPham> entities) {
		NSPDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		NSPDAO.deleteAll();
	}

	@Override
	public NhomSanPham getById(String id) {
		return NSPDAO.getById(id);
	}

	@Override
	public <S extends NhomSanPham> List<S> findAll(Example<S> example) {
		return NSPDAO.findAll(example);
	}

	@Override
	public <S extends NhomSanPham> List<S> findAll(Example<S> example, Sort sort) {
		return NSPDAO.findAll(example, sort);
	}
	
	
}
