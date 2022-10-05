package com.artrend.businessservice.domain.painting.repository.custom;

import com.artrend.businessservice.domain.painting.entity.ChangedPainting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChangedPaintingRepositoryCustom {
    Page<ChangedPainting> findChangedPaintingsAll(Long memberId, Pageable pageable);
}
