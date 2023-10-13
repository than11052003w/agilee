/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an.services;

import du_an.models.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duy09
 */
public interface InterfaceService<T> {

    public void insert(T t);

    public void update(int index, T t);

    public void delete(T t);

    public void sortMa();

    public List<T> selectAll();

    public T selectMa(String ma);

    public List<T> selectName(String name);

    List<NhanVien> searchByMa(List<NhanVien> listNV, String nv);

    List<NhanVien> searchByName(List<NhanVien> listNV, String ten);
}
