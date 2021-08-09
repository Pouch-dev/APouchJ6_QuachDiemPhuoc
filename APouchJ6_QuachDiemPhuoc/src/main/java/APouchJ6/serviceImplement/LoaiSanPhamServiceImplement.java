package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import APouchJ6.dao.LoaiSanPhamDAO;
import APouchJ6.entity.LoaiSanPham;
import APouchJ6.service.LoaiSanPhamService;

@Service
public class LoaiSanPhamServiceImplement  implements LoaiSanPhamService{
	
	@Autowired
	LoaiSanPhamDAO LSPDAO;

	@Override
	public <S extends LoaiSanPham> S save(S entity) {
		return LSPDAO.save(entity);
	}

	@Override
	public <S extends LoaiSanPham> Optional<S> findOne(Example<S> example) {
		return LSPDAO.findOne(example);
	}

	@Override
	public Page<LoaiSanPham> findAll(Pageable pageable) {
		return LSPDAO.findAll(pageable);
	}

	@Override
	public List<LoaiSanPham> findAll() {
		return LSPDAO.findAll();
	}

	@Override
	public List<LoaiSanPham> findAll(Sort sort) {
		return LSPDAO.findAll(sort);
	}

	@Override
	public List<LoaiSanPham> findAllById(Iterable<String> ids) {
		return LSPDAO.findAllById(ids);
	}

	@Override
	public LoaiSanPham findById(String id) {
		return LSPDAO.findById(id).get();
	}

	@Override
	public <S extends LoaiSanPham> List<S> saveAll(Iterable<S> entities) {
		return LSPDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		LSPDAO.flush();
	}

	@Override
	public <S extends LoaiSanPham> S saveAndFlush(S entity) {
		return LSPDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(String id) {
		return LSPDAO.existsById(id);
	}

	@Override
	public <S extends LoaiSanPham> List<S> saveAllAndFlush(Iterable<S> entities) {
		return LSPDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends LoaiSanPham> Page<S> findAll(Example<S> example, Pageable pageable) {
		return LSPDAO.findAll(example, pageable);
	}

	@Override
	public <S extends LoaiSanPham> long count(Example<S> example) {
		return LSPDAO.count(example);
	}

	@Override
	public <S extends LoaiSanPham> boolean exists(Example<S> example) {
		return LSPDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<LoaiSanPham> entities) {
		LSPDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return LSPDAO.count();
	}

	@Override
	public void deleteById(String id) {
		LSPDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		LSPDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(LoaiSanPham entity) {
		LSPDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		LSPDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		LSPDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends LoaiSanPham> entities) {
		LSPDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		LSPDAO.deleteAll();
	}

	@Override
	public LoaiSanPham getById(String id) {
		return LSPDAO.getById(id);
	}

	@Override
	public <S extends LoaiSanPham> List<S> findAll(Example<S> example) {
		return LSPDAO.findAll(example);
	}

	@Override
	public <S extends LoaiSanPham> List<S> findAll(Example<S> example, Sort sort) {
		return LSPDAO.findAll(example, sort);
	}
	
	
}
