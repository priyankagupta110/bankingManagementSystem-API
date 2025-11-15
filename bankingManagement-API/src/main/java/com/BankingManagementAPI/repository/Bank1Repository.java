package com.BankingManagementAPI.repository;

import com.BankingManagementAPI.entity.Bank1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bank1Repository extends JpaRepository<Bank1,Integer>
//JpaRepository is an interface which contain all the query. We made jpaRepository as generic<Entityname, Primary key datatype>
    // we use interface to extends jpaRepository because if we implement on class we have to give implementation to all the method present in the jpa repository.
    //And this will be the waste of time as well as we need to type the code again.
    //Therefor we use interface to implement jpaRepository and one more thing if we directly implement or extend JPArepository where ever we need it than we will
        // not be able to made our own customised method. in this case we can make and can use.
    //JpaRepository extends Querybyexampleexector, listcurdRepository.Pagingandsortingrepository.
    //Therefor always extend JpaRepository because it involve every thing.

{



}
