DROP TABLE IF EXISTS PROMMTGL;

CREATE TABLE PROMMTGL (
    ID              INT PRIMARY KEY AUTO_INCREMENT,
    ITEM_NO         VARCHAR,
    IMAGE_FILE_PATH VARCHAR,
    DESCRIPTION_LOC VARCHAR,
    MATERIAL_CLASS  VARCHAR,
    SPECIFICATION   VARCHAR,
    BASIC_UNIT      VARCHAR,
    MAKER_NAME      VARCHAR,
    MODEL_NO        VARCHAR,
    ORIGIN_COUNTRY  VARCHAR,
    HS_NO           VARCHAR,
    ADD_USER_ID     VARCHAR,
    ADD_DATE        DATE
--     ,
--     POPULATION INT
);

INSERT INTO PROMMTGL (
    ID,
    ITEM_NO,
    IMAGE_FILE_PATH,
    DESCRIPTION_LOC,
    MATERIAL_CLASS,
    SPECIFICATION,
    BASIC_UNIT,
    MAKER_NAME,
    MODEL_NO,
    ORIGIN_COUNTRY,
    HS_NO,
    ADD_USER_ID,
    ADD_DATE
) VALUES (
    1L,
    'GD2020001',
    'US',
    '안전화',
    '공구',
    '260',
    'EA',
    '아디다스',
    '에어조단',
    '東京',
    '260360980',
    '2279894',
    CURRENT_TIMESTAMP()
);

INSERT INTO PROMMTGL (
    ID,
    ITEM_NO,
    IMAGE_FILE_PATH,
    DESCRIPTION_LOC,
    MATERIAL_CLASS,
    SPECIFICATION,
    BASIC_UNIT,
    MAKER_NAME,
    MODEL_NO,
    ORIGIN_COUNTRY,
    HS_NO,
    ADD_USER_ID,
    ADD_DATE
) VALUES (
    2L,
    'GB2020001',
    'US',
    '안전화',
    '공구',
    '270',
    'EA',
    '나이키',
    '에어조단',
    '서울',
    '260360980',
    '2279894',
    CURRENT_TIMESTAMP()
);

INSERT INTO PROMMTGL (
    ID,
    ITEM_NO,
    IMAGE_FILE_PATH,
    DESCRIPTION_LOC,
    MATERIAL_CLASS,
    SPECIFICATION,
    BASIC_UNIT,
    MAKER_NAME,
    MODEL_NO,
    ORIGIN_COUNTRY,
    HS_NO,
    ADD_USER_ID,
    ADD_DATE
) VALUES (
    3L,
    'GS2020001',
    'US',
    '장갑',
    '공구',
    '270',
    'EA',
    '나이키',
    '골프용',
    '서울',
    '260360980',
    '2279894',
    CURRENT_TIMESTAMP()
);


