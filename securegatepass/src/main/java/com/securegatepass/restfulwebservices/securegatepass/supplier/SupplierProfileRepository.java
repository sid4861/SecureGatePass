package com.securegatepass.restfulwebservices.securegatepass.supplier;



import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfile;


@Repository
@ViewIndexed(designDoc = "supplierProfile", viewName = "all")
public interface SupplierProfileRepository extends CouchbaseRepository<SupplierProfile, String> {

}
