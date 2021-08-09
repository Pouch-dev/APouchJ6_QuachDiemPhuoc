package APouchJ6.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import APouchJ6.dao.SanPhamDAO;
import APouchJ6.entity.SanPham;
import APouchJ6.service.SanPhamService;

@Service
public class SanPhamServiceImplement  implements SanPhamService{
	
	@Autowired
	SanPhamDAO SPDAO;

	@Override
	public <S extends SanPham> S save(S entity) {
		return SPDAO.save(entity);
	}

	@Override
	public <S extends SanPham> Optional<S> findOne(Example<S> example) {
		return SPDAO.findOne(example);
	}

	@Override
	public Page<SanPham> findAll(Pageable pageable) {
		return SPDAO.findAll(pageable);
	}

	@Override
	public List<SanPham> findAll() {
		return SPDAO.findAll();
	}

	@Override
	public List<SanPham> findAll(Sort sort) {
		return SPDAO.findAll(sort);
	}

	@Override
	public List<SanPham> findAllById(Iterable<Integer> ids) {
		return SPDAO.findAllById(ids);
	}

	@Override
	public SanPham findById(Integer id) {
		return SPDAO.findById(id).get();
	}

	@Override
	public <S extends SanPham> List<S> saveAll(Iterable<S> entities) {
		return SPDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		SPDAO.flush();
	}

	@Override
	public <S extends SanPham> S saveAndFlush(S entity) {
		return SPDAO.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return SPDAO.existsById(id);
	}

	@Override
	public <S extends SanPham> List<S> saveAllAndFlush(Iterable<S> entities) {
		return SPDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends SanPham> Page<S> findAll(Example<S> example, Pageable pageable) {
		return SPDAO.findAll(example, pageable);
	}

	@Override
	public <S extends SanPham> long count(Example<S> example) {
		return SPDAO.count(example);
	}

	@Override
	public <S extends SanPham> boolean exists(Example<S> example) {
		return SPDAO.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<SanPham> entities) {
		SPDAO.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return SPDAO.count();
	}

	@Override
	public void deleteById(Integer id) {
		SPDAO.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		SPDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(SanPham entity) {
		SPDAO.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		SPDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		SPDAO.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends SanPham> entities) {
		SPDAO.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		SPDAO.deleteAll();
	}

	@Override
	public SanPham getById(Integer id) {
		return SPDAO.getById(id);
	}

	@Override
	public <S extends SanPham> List<S> findAll(Example<S> example) {
		return SPDAO.findAll(example);
	}

	@Override
	public <S extends SanPham> List<S> findAll(Example<S> example, Sort sort) {
		return SPDAO.findAll(example, sort);
	}

	@Override
	public List<SanPham> findByCateID(String cid) {
		return SPDAO.findByCateID(cid);
	}

	@Override
	public SanPham create(SanPham sanpham) {
		return SPDAO.save(sanpham);
	}

	@Override
	public SanPham update(SanPham sanpham) {
		return SPDAO.save(sanpham);
	}

	@Override
	public void delete(Integer id) {
		 SPDAO.deleteById(id);
	}

	
}
