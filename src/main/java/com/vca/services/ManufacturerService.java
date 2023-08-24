package com.vca.services;

import java.util.List;
import com.vca.entity.Manufacturer;

public interface ManufacturerService {

	List<Manufacturer> getAllManufacturersById(int id);
}
