package exam.repository;

import exam.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
    Optional<Laptop> findByMacAddress(String macAddress);

    @Query("SELECT l from Laptop l" +
            " ORDER BY l.cpuSpeed DESC," +
            " l.ram DESC, " +
            " l.storage DESC," +
            " l.macAddress ASC")
    List<Laptop> findAllOrderByCpuSpeedDescRamDescStorageDescMacAddressAsc();
}
