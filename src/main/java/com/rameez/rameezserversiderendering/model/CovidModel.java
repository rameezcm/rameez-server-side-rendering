package com.rameez.rameezserversiderendering.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "updated",
        "country",
        "countryInfo",
        "cases",
        "todayCases",
        "deaths",
        "todayDeaths",
        "recovered",
        "active",
        "critical",
        "casesPerOneMillion",
        "deathsPerOneMillion",
        "tests",
        "testsPerOneMillion",
        "population",
        "continent",
        "activePerOneMillion",
        "recoveredPerOneMillion",
        "criticalPerOneMillion"
})
@Data
public class CovidModel {
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("country")
    private String country;
    @JsonProperty("countryInfo")
    private CountryInfo countryInfo;
    @JsonProperty("cases")
    private Integer cases;
    @JsonProperty("todayCases")
    private Integer todayCases;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("todayDeaths")
    private Integer todayDeaths;
    @JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("critical")
    private Integer critical;
    @JsonProperty("casesPerOneMillion")
    private Integer casesPerOneMillion;
    @JsonProperty("deathsPerOneMillion")
    private Integer deathsPerOneMillion;
    @JsonProperty("tests")
    private Integer tests;
    @JsonProperty("testsPerOneMillion")
    private Integer testsPerOneMillion;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("activePerOneMillion")
    private Double activePerOneMillion;
    @JsonProperty("recoveredPerOneMillion")
    private Double recoveredPerOneMillion;
    @JsonProperty("criticalPerOneMillion")
    private Double criticalPerOneMillion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("countryInfo")
    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    @JsonProperty("countryInfo")
    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    @JsonProperty("cases")
    public Integer getCases() {
        return cases;
    }

    @JsonProperty("cases")
    public void setCases(Integer cases) {
        this.cases = cases;
    }

    @JsonProperty("todayCases")
    public Integer getTodayCases() {
        return todayCases;
    }

    @JsonProperty("todayCases")
    public void setTodayCases(Integer todayCases) {
        this.todayCases = todayCases;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("todayDeaths")
    public Integer getTodayDeaths() {
        return todayDeaths;
    }

    @JsonProperty("todayDeaths")
    public void setTodayDeaths(Integer todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("critical")
    public Integer getCritical() {
        return critical;
    }

    @JsonProperty("critical")
    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    @JsonProperty("casesPerOneMillion")
    public Integer getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    @JsonProperty("casesPerOneMillion")
    public void setCasesPerOneMillion(Integer casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    @JsonProperty("deathsPerOneMillion")
    public Integer getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    @JsonProperty("deathsPerOneMillion")
    public void setDeathsPerOneMillion(Integer deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    @JsonProperty("tests")
    public Integer getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(Integer tests) {
        this.tests = tests;
    }

    @JsonProperty("testsPerOneMillion")
    public Integer getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    @JsonProperty("testsPerOneMillion")
    public void setTestsPerOneMillion(Integer testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("activePerOneMillion")
    public Double getActivePerOneMillion() {
        return activePerOneMillion;
    }

    @JsonProperty("activePerOneMillion")
    public void setActivePerOneMillion(Double activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    @JsonProperty("recoveredPerOneMillion")
    public Double getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    @JsonProperty("recoveredPerOneMillion")
    public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    @JsonProperty("criticalPerOneMillion")
    public Double getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    @JsonProperty("criticalPerOneMillion")
    public void setCriticalPerOneMillion(Double criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

