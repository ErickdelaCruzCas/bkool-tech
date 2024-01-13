package com.erick.bkool.repository.adapters;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ItemRepositoryAdapter {

//        private final PricesListMOJpaRepository repository;
//
//        private final PricesListMOMapper mapper;
//
//        @Override
//        public List<PricesList> getPricesListFromFilter(PricesListFilter pricesListFilter) {
//                return repository.findPricesListByFilter(
//                        pricesListFilter.getBrandId(),
//                        pricesListFilter.getProductId(),
//                        pricesListFilter.getApplicationDate()
//                        ).stream()
//                .map(mapper::fromModel)
//                .collect(Collectors.toList());
//        }
//
//        @Override
//        public PricesList findPricesListById(Integer id) {
//                return mapper.fromModel(repository.findById(id)
//                        .orElseThrow(() -> new ResourceNotFoundException(
//                        "The price was not found", 404)));
//        }

}

