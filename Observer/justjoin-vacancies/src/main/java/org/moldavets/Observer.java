package org.moldavets;

import java.util.List;

public interface Observer {
    void accept(List<String> vacancies);
}
