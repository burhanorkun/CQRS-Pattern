package com.orkun.cqrspattern.service;

import com.orkun.cqrspattern.dto.PurchaseOrderSummaryDto;

import java.util.List;

public interface OrderQueryService {
    List<PurchaseOrderSummaryDto> getSaleSummaryGroupByState();
    PurchaseOrderSummaryDto getSaleSummaryByState(String state);
    double getTotalSale();
}
