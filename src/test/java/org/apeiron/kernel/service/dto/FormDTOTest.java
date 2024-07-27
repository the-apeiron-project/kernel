package org.apeiron.kernel.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.apeiron.kernel.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class FormDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(FormDTO.class);
        FormDTO formDTO1 = new FormDTO();
        formDTO1.setId("id1");
        FormDTO formDTO2 = new FormDTO();
        assertThat(formDTO1).isNotEqualTo(formDTO2);
        formDTO2.setId(formDTO1.getId());
        assertThat(formDTO1).isEqualTo(formDTO2);
        formDTO2.setId("id2");
        assertThat(formDTO1).isNotEqualTo(formDTO2);
        formDTO1.setId(null);
        assertThat(formDTO1).isNotEqualTo(formDTO2);
    }
}
