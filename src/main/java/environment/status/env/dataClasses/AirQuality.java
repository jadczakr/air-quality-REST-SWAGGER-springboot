package environment.status.env.dataClasses;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"stCalcDate",
"stIndexLevel",
"stSourceDataDate",
"so2CalcDate",
"so2IndexLevel",
"so2SourceDataDate",
"no2CalcDate",
"no2IndexLevel",
"no2SourceDataDate",
"coCalcDate",
"coIndexLevel",
"coSourceDataDate",
"pm10CalcDate",
"pm10IndexLevel",
"pm10SourceDataDate",
"pm25CalcDate",
"pm25IndexLevel",
"pm25SourceDataDate",
"o3CalcDate",
"o3IndexLevel",
"o3SourceDataDate",
"c6h6CalcDate",
"c6h6IndexLevel",
"c6h6SourceDataDate"
})
public class AirQuality {

@JsonProperty("id")
private Integer id;
@JsonProperty("stCalcDate")
private String stCalcDate;
@JsonProperty("stIndexLevel")
private StIndexLevel stIndexLevel;
@JsonProperty("stSourceDataDate")
private String stSourceDataDate;
@JsonProperty("so2CalcDate")
private String so2CalcDate;
@JsonProperty("so2IndexLevel")
private Object so2IndexLevel;
@JsonProperty("so2SourceDataDate")
private String so2SourceDataDate;
@JsonProperty("no2CalcDate")
private String no2CalcDate;
@JsonProperty("no2IndexLevel")
private Object no2IndexLevel;
@JsonProperty("no2SourceDataDate")
private String no2SourceDataDate;
@JsonProperty("coCalcDate")
private String coCalcDate;
@JsonProperty("coIndexLevel")
private Object coIndexLevel;
@JsonProperty("coSourceDataDate")
private String coSourceDataDate;
@JsonProperty("pm10CalcDate")
private String pm10CalcDate;
@JsonProperty("pm10IndexLevel")
private Object pm10IndexLevel;
@JsonProperty("pm10SourceDataDate")
private String pm10SourceDataDate;
@JsonProperty("pm25CalcDate")
private String pm25CalcDate;
@JsonProperty("pm25IndexLevel")
private Object pm25IndexLevel;
@JsonProperty("pm25SourceDataDate")
private Object pm25SourceDataDate;
@JsonProperty("o3CalcDate")
private String o3CalcDate;
@JsonProperty("o3IndexLevel")
private Object o3IndexLevel;
@JsonProperty("o3SourceDataDate")
private String o3SourceDataDate;
@JsonProperty("c6h6CalcDate")
private String c6h6CalcDate;
@JsonProperty("c6h6IndexLevel")
private Object c6h6IndexLevel;
@JsonProperty("c6h6SourceDataDate")
private String c6h6SourceDataDate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("stCalcDate")
public String getStCalcDate() {
return stCalcDate;
}

@JsonProperty("stCalcDate")
public void setStCalcDate(String stCalcDate) {
this.stCalcDate = stCalcDate;
}

@JsonProperty("stIndexLevel")
public StIndexLevel getStIndexLevel() {
return stIndexLevel;
}

@JsonProperty("stIndexLevel")
public void setStIndexLevel(StIndexLevel stIndexLevel) {
this.stIndexLevel = stIndexLevel;
}

@JsonProperty("stSourceDataDate")
public String getStSourceDataDate() {
return stSourceDataDate;
}

@JsonProperty("stSourceDataDate")
public void setStSourceDataDate(String stSourceDataDate) {
this.stSourceDataDate = stSourceDataDate;
}

@JsonProperty("so2CalcDate")
public String getSo2CalcDate() {
return so2CalcDate;
}

@JsonProperty("so2CalcDate")
public void setSo2CalcDate(String so2CalcDate) {
this.so2CalcDate = so2CalcDate;
}

@JsonProperty("so2IndexLevel")
public Object getSo2IndexLevel() {
return so2IndexLevel;
}

@JsonProperty("so2IndexLevel")
public void setSo2IndexLevel(Object so2IndexLevel) {
this.so2IndexLevel = so2IndexLevel;
}

@JsonProperty("so2SourceDataDate")
public String getSo2SourceDataDate() {
return so2SourceDataDate;
}

@JsonProperty("so2SourceDataDate")
public void setSo2SourceDataDate(String so2SourceDataDate) {
this.so2SourceDataDate = so2SourceDataDate;
}

@JsonProperty("no2CalcDate")
public String getNo2CalcDate() {
return no2CalcDate;
}

@JsonProperty("no2CalcDate")
public void setNo2CalcDate(String no2CalcDate) {
this.no2CalcDate = no2CalcDate;
}

@JsonProperty("no2IndexLevel")
public Object getNo2IndexLevel() {
return no2IndexLevel;
}

@JsonProperty("no2IndexLevel")
public void setNo2IndexLevel(Object no2IndexLevel) {
this.no2IndexLevel = no2IndexLevel;
}

@JsonProperty("no2SourceDataDate")
public String getNo2SourceDataDate() {
return no2SourceDataDate;
}

@JsonProperty("no2SourceDataDate")
public void setNo2SourceDataDate(String no2SourceDataDate) {
this.no2SourceDataDate = no2SourceDataDate;
}

@JsonProperty("coCalcDate")
public String getCoCalcDate() {
return coCalcDate;
}

@JsonProperty("coCalcDate")
public void setCoCalcDate(String coCalcDate) {
this.coCalcDate = coCalcDate;
}

@JsonProperty("coIndexLevel")
public Object getCoIndexLevel() {
return coIndexLevel;
}

@JsonProperty("coIndexLevel")
public void setCoIndexLevel(Object coIndexLevel) {
this.coIndexLevel = coIndexLevel;
}

@JsonProperty("coSourceDataDate")
public String getCoSourceDataDate() {
return coSourceDataDate;
}

@JsonProperty("coSourceDataDate")
public void setCoSourceDataDate(String coSourceDataDate) {
this.coSourceDataDate = coSourceDataDate;
}

@JsonProperty("pm10CalcDate")
public String getPm10CalcDate() {
return pm10CalcDate;
}

@JsonProperty("pm10CalcDate")
public void setPm10CalcDate(String pm10CalcDate) {
this.pm10CalcDate = pm10CalcDate;
}

@JsonProperty("pm10IndexLevel")
public Object getPm10IndexLevel() {
return pm10IndexLevel;
}

@JsonProperty("pm10IndexLevel")
public void setPm10IndexLevel(Object pm10IndexLevel) {
this.pm10IndexLevel = pm10IndexLevel;
}

@JsonProperty("pm10SourceDataDate")
public String getPm10SourceDataDate() {
return pm10SourceDataDate;
}

@JsonProperty("pm10SourceDataDate")
public void setPm10SourceDataDate(String pm10SourceDataDate) {
this.pm10SourceDataDate = pm10SourceDataDate;
}

@JsonProperty("pm25CalcDate")
public String getPm25CalcDate() {
return pm25CalcDate;
}

@JsonProperty("pm25CalcDate")
public void setPm25CalcDate(String pm25CalcDate) {
this.pm25CalcDate = pm25CalcDate;
}

@JsonProperty("pm25IndexLevel")
public Object getPm25IndexLevel() {
return pm25IndexLevel;
}

@JsonProperty("pm25IndexLevel")
public void setPm25IndexLevel(Object pm25IndexLevel) {
this.pm25IndexLevel = pm25IndexLevel;
}

@JsonProperty("pm25SourceDataDate")
public Object getPm25SourceDataDate() {
return pm25SourceDataDate;
}

@JsonProperty("pm25SourceDataDate")
public void setPm25SourceDataDate(Object pm25SourceDataDate) {
this.pm25SourceDataDate = pm25SourceDataDate;
}

@JsonProperty("o3CalcDate")
public String getO3CalcDate() {
return o3CalcDate;
}

@JsonProperty("o3CalcDate")
public void setO3CalcDate(String o3CalcDate) {
this.o3CalcDate = o3CalcDate;
}

@JsonProperty("o3IndexLevel")
public Object getO3IndexLevel() {
return o3IndexLevel;
}

@JsonProperty("o3IndexLevel")
public void setO3IndexLevel(Object o3IndexLevel) {
this.o3IndexLevel = o3IndexLevel;
}

@JsonProperty("o3SourceDataDate")
public String getO3SourceDataDate() {
return o3SourceDataDate;
}

@JsonProperty("o3SourceDataDate")
public void setO3SourceDataDate(String o3SourceDataDate) {
this.o3SourceDataDate = o3SourceDataDate;
}

@JsonProperty("c6h6CalcDate")
public String getC6h6CalcDate() {
return c6h6CalcDate;
}

@JsonProperty("c6h6CalcDate")
public void setC6h6CalcDate(String c6h6CalcDate) {
this.c6h6CalcDate = c6h6CalcDate;
}

@JsonProperty("c6h6IndexLevel")
public Object getC6h6IndexLevel() {
return c6h6IndexLevel;
}

@JsonProperty("c6h6IndexLevel")
public void setC6h6IndexLevel(Object c6h6IndexLevel) {
this.c6h6IndexLevel = c6h6IndexLevel;
}

@JsonProperty("c6h6SourceDataDate")
public String getC6h6SourceDataDate() {
return c6h6SourceDataDate;
}

@JsonProperty("c6h6SourceDataDate")
public void setC6h6SourceDataDate(String c6h6SourceDataDate) {
this.c6h6SourceDataDate = c6h6SourceDataDate;
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