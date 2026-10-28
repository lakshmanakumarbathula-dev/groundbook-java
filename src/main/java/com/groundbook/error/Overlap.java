package com.groundbook.error;

import java.util.List;
import java.util.Map;

/**
 * 409 /errors/overlap: the slot's shadow clashes with another live booking's shadow. `clashesWith` names each one and
 * the range it holds.
 */
public class Overlap extends DomainException {

    private final List<Map<String, Object>> clashesWith;

    public Overlap(List<Map<String, Object>> clashesWith) {
        super(
                409, "/errors/overlap", "Overlap", "With its buffers this slot clashes with "
                        + clashesWith.size()
                        + " booking(s) on the ground");
        this.clashesWith = clashesWith;
    }

    @Override
    public Map<String, Object> properties() {
        return Map.of("clashesWith", clashesWith);
    }
}
