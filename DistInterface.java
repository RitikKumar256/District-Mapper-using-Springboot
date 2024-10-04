package com.example.demo.maxx;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DistInterface  extends JpaRepository<DistBean,String>
{
List<DistBean> getDistBeanListByStCode(String stCode);
}
