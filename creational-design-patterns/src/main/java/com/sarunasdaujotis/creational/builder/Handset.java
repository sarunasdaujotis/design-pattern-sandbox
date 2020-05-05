package com.sarunasdaujotis.creational.builder;

import java.util.Objects;

public final class Handset {

	private final String sku;
	private final String description;
	private final boolean available;

	private Handset(final String sku, final String description, final boolean available) {
		this.sku = sku;
		this.description = description;
		this.available = available;
	}

	public String getSku() {
		return sku;
	}

	public String getDescription() {
		return description;
	}

	public boolean isAvailable() {
		return available;
	}

	public static class Builder {
		private String sku;
		private String description;
		private boolean available;

		public Builder withSku(final String sku) {
			this.sku = sku;
			return this;
		}

		public Builder withDescription(final String description) {
			this.description = description;
			return this;
		}

		public Builder withAvailability(final boolean availability) {
			this.available = availability;
			return this;
		}

		public Handset build() {
			return new Handset(sku, description, available);
		}
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final Handset handset = (Handset) o;
		return available == handset.available &&
				Objects.equals(sku, handset.sku) &&
				Objects.equals(description, handset.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sku, description, available);
	}
}
