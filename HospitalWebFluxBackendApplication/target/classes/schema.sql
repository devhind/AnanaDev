CREATE TABLE IF NOT EXISTS patient (
    id SERIAL PRIMARY KEY,
    title VARCHAR(10),
    patient_name VARCHAR(100),
    phone_number VARCHAR(20),
    gender VARCHAR(10),
    age INT,
    dob DATE,
    city VARCHAR(50),
    language VARCHAR(30),
    pin_code VARCHAR(10),
    address TEXT,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE patient_additional_details (
    id BIGSERIAL PRIMARY KEY,
    patient_id BIGINT UNIQUE NOT NULL,

    marital_status VARCHAR(20),
    anniversary_date DATE,
    blood_group VARCHAR(10),
    spouse_name VARCHAR(100),
    spouse_blood_group VARCHAR(10),
    referring_doctor VARCHAR(100),
    speciality VARCHAR(100),
    channel VARCHAR(50),
    c_o VARCHAR(100),
    occupation VARCHAR(100),
    tag VARCHAR(50),
    alternate_mobile VARCHAR(15),
    aadhar_number VARCHAR(20),

    CONSTRAINT fk_patient
      FOREIGN KEY (patient_id)
      REFERENCES patient(id)
      ON DELETE CASCADE
);
CREATE TABLE patient_custom_field_values (
    id BIGSERIAL PRIMARY KEY,

    patient_id BIGINT NOT NULL,
    custom_field_id INT NOT NULL,

    field_value TEXT, -- stores value as string (safe for all types)

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_pcfv_patient
        FOREIGN KEY (patient_id)
        REFERENCES patient(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_pcfv_custom_field
        FOREIGN KEY (custom_field_id)
        REFERENCES custom_fields(id)
        ON DELETE CASCADE,

    CONSTRAINT uq_patient_custom_field
        UNIQUE (patient_id, custom_field_id)
);



