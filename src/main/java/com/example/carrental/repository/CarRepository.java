package com.example.carrental.repository;

import com.example.carrental.entity.Car;
import com.example.carrental.model.RequestDto;
import com.example.carrental.utility.APIResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findById(int Id);

    @Query(value = "select * from car where (Case when '0'=?3 then name is not null else name=?3 End)" +
            "AND (Case when '0'=?4 then booking_status is not null else booking_status=?4 End)" +
            "AND (Case when '0'=?5 then number is not null else number=?5 End) LIMIT ?1,?2",
            nativeQuery = true)
    List<Car> getCarData( int offset, int limit, String name, String bookingStatus, String number);

    @Query(value = "select * from car where (Case when '7'=?1 then number is not null else number=?1 End)", nativeQuery = true)
    List<Car> getNumbData(String number);

    @Query(value = "select * from car c where(c.name = ?1 and c.booking_status = ?2 and c.number = ?3)"+
            "OR(c.name = ?1)"+
            "OR(c.number = ?3)"+
            "OR(c.name = ?1 and c.booking_status = ?2)"+
            "OR(c.name = ?1 and c.number = ?3)"+
            "OR(c.booking_status = ?2 and c.number = ?3)"
            ,nativeQuery = true)
    List<Car> getAllCarData(String name, String bookingStatus, String number);

    @Query(value = "select * from car where(Case when '0'=?1 then booking_status is not null else booking_status=?1 End)", nativeQuery = true)
    List<Car> getByBookingStatus(String bookingStatus);
    @Query(value = "select c from Car c Where name=:name")
    List<Car> getNData(@Param("name") String name);


    @Query(value= " select count(*) from car where (Case when '0'=?1 then name is not null else name=?1 End)" +
            "AND (Case when '0'=?2 then booking_status is not null else booking_status=?2 End)" +
            "AND (Case when '0'=?3 then number is not null else number=?3 End)",
             nativeQuery = true)
    int getCount( String name, String bookingStatus, String number);

    List<Car> sortData(int id);
}

//    @Query(value = "select * from car where (Case when '0'=?1 then booking status is not null else booking_status=?1 End)",
//            nativeQuery = true)
//    List<Car> getBData(String bookingStatus);
//}
