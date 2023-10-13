/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an.services.impl;

import du_an.models.NhanVien;
import du_an.services.InterfaceService;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duy09
 */
public class NhanVienService implements InterfaceService<NhanVien> {

    public static List<NhanVien> nhanViens = new ArrayList<>();

    @Override
    public void insert(NhanVien t) {
        this.nhanViens.add(t);
    }

    @Override
    public void update(int index, NhanVien t) {
        this.nhanViens.set(index, t);
    }

    @Override
    public void delete(NhanVien t) {
        this.nhanViens.remove(t);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.nhanViens;
    }

    @Override
    public NhanVien selectMa(String ma) {
        for (NhanVien nv : nhanViens) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                return nv;
            }
        }
        return null;
    }

    @Override
    public List<NhanVien> selectName(String name) {
        List<NhanVien> ketQua = new ArrayList<>();
        for (NhanVien nv : nhanViens) {
            if (nv.getHoTen().equalsIgnoreCase(name)) {
                ketQua.add(nv);
            }
        }
        return ketQua;
    }

    @Override
    public void sortMa() {
        nhanViens.sort((o1, o2) -> {
            return o1.getMa().compareToIgnoreCase(o2.getMa());
        });
    }
    
    public void sortTen() {
        nhanViens.sort((o1, o2) -> {
            return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
        });
    }

    @Override
    public List<NhanVien> searchByMa(List<NhanVien> listNV, String nv) {
        List<NhanVien> listSearch = new ArrayList<>();
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMa().contains(nv)) {
                listSearch.add(listNV.get(i));
            }
        }
        return listSearch;
    }

    @Override
    public List<NhanVien> searchByName(List<NhanVien> listNV, String ten) {
        List<NhanVien> listSearch = new ArrayList<>();
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getHoTen().contains(ten)) {
                listSearch.add(listNV.get(i));
            }
        }
        return listSearch;
    }
    public static void ghiDuLieu(){
        try {
            FileOutputStream fos = new FileOutputStream("NhanVien.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(NhanVienService.nhanViens);
            fos.close();
            oos.close();
        } catch (Exception e) {
        }
    }
}
