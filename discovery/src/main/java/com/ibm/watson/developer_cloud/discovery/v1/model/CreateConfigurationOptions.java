/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.discovery.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;

/**
 * The createConfiguration options.
 */
public class CreateConfigurationOptions extends GenericModel {

  private String environmentId;
  private String name;
  private String description;
  private Conversions conversions;
  private List<Enrichment> enrichments;
  private List<NormalizationOperation> normalizations;

  /**
   * Builder.
   */
  public static class Builder {
    private String environmentId;
    private String name;
    private String description;
    private Conversions conversions;
    private List<Enrichment> enrichments;
    private List<NormalizationOperation> normalizations;

    private Builder(CreateConfigurationOptions createConfigurationOptions) {
      environmentId = createConfigurationOptions.environmentId;
      name = createConfigurationOptions.name;
      description = createConfigurationOptions.description;
      conversions = createConfigurationOptions.conversions;
      enrichments = createConfigurationOptions.enrichments;
      normalizations = createConfigurationOptions.normalizations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param environmentId the environmentId
     */
    public Builder(String environmentId) {
      this.environmentId = environmentId;
    }

    /**
     * Builds a CreateConfigurationOptions.
     *
     * @return the createConfigurationOptions
     */
    public CreateConfigurationOptions build() {
      return new CreateConfigurationOptions(this);
    }

    /**
     * Adds an enrichment to enrichments.
     *
     * @param enrichment the new enrichment
     * @return the CreateConfigurationOptions builder
     */
    public Builder addEnrichment(Enrichment enrichment) {
      Validator.notNull(enrichment, "enrichment cannot be null");
      if (this.enrichments == null) {
        this.enrichments = new ArrayList<Enrichment>();
      }
      this.enrichments.add(enrichment);
      return this;
    }

    /**
     * Adds an normalization to normalizations.
     *
     * @param normalization the new normalization
     * @return the CreateConfigurationOptions builder
     */
    public Builder addNormalization(NormalizationOperation normalization) {
      Validator.notNull(normalization, "normalization cannot be null");
      if (this.normalizations == null) {
        this.normalizations = new ArrayList<NormalizationOperation>();
      }
      this.normalizations.add(normalization);
      return this;
    }

    /**
     * Set the environmentId.
     *
     * @param environmentId the environmentId
     * @return the CreateConfigurationOptions builder
     */
    public Builder environmentId(String environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateConfigurationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateConfigurationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the conversions.
     *
     * @param conversions the conversions
     * @return the CreateConfigurationOptions builder
     */
    public Builder conversions(Conversions conversions) {
      this.conversions = conversions;
      return this;
    }

    /**
     * Set the enrichments.
     * Existing enrichments will be replaced.
     *
     * @param enrichments the enrichments
     * @return the CreateConfigurationOptions builder
     */
    public Builder enrichments(List<Enrichment> enrichments) {
      this.enrichments = enrichments;
      return this;
    }

    /**
     * Set the normalizations.
     * Existing normalizations will be replaced.
     *
     * @param normalizations the normalizations
     * @return the CreateConfigurationOptions builder
     */
    public Builder normalizations(List<NormalizationOperation> normalizations) {
      this.normalizations = normalizations;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the CreateConfigurationOptions builder
     */
    public Builder configuration(Configuration configuration) {
      this.name = configuration.getName();
      this.description = configuration.getDescription();
      this.conversions = configuration.getConversions();
      this.enrichments = configuration.getEnrichments();
      this.normalizations = configuration.getNormalizations();
      return this;
    }
  }

  private CreateConfigurationOptions(Builder builder) {
    Validator.notEmpty(builder.environmentId, "environmentId cannot be empty");
    environmentId = builder.environmentId;
    name = builder.name;
    description = builder.description;
    conversions = builder.conversions;
    enrichments = builder.enrichments;
    normalizations = builder.normalizations;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the environmentId.
   *
   * The ID of the environment.
   *
   * @return the environmentId
   */
  public String environmentId() {
    return environmentId;
  }

  /**
   * Gets the name.
   *
   * The name of the configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of the configuration, if available.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the conversions.
   *
   * The document conversion settings for the configuration.
   *
   * @return the conversions
   */
  public Conversions conversions() {
    return conversions;
  }

  /**
   * Gets the enrichments.
   *
   * An array of document enrichment settings for the configuration.
   *
   * @return the enrichments
   */
  public List<Enrichment> enrichments() {
    return enrichments;
  }

  /**
   * Gets the normalizations.
   *
   * Defines operations that can be used to transform the final output JSON into a normalized form. Operations are
   * executed in the order that they appear in the array.
   *
   * @return the normalizations
   */
  public List<NormalizationOperation> normalizations() {
    return normalizations;
  }
}
