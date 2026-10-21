Documentaion

PackNext: Order Priority Planner

Our Endpoints :

{
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/materials": {
      "get": {
        "tags": [
          "material-controller"
        ],
        "operationId": "getAllMaterials",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Material"
                  }
                }
              }
            }
          }
        }
      },
      "put": {
        "tags": [
          "material-controller"
        ],
        "operationId": "updateMaterial",
        "parameters": [
          {
            "name": "id",
            "in": "query",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          },
          {
            "name": "materialDTO",
            "in": "query",
            "required": true,
            "schema": {
              "$ref": "#/components/schemas/MaterialDTO"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Material"
                }
              }
            }
          }
        }
      },
      "post": {
        "tags": [
          "material-controller"
        ],
        "operationId": "createMaterial",
        "parameters": [
          {
            "name": "materialDTO",
            "in": "query",
            "required": true,
            "schema": {
              "$ref": "#/components/schemas/MaterialDTO"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Material"
                }
              }
            }
          }
        }
      },
      "delete": {
        "tags": [
          "material-controller"
        ],
        "operationId": "deleteMaterial",
        "parameters": [
          {
            "name": "id",
            "in": "query",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK"
          }
        }
      }
    },
    "/customer": {
      "get": {
        "tags": [
          "customer-controller"
        ],
        "operationId": "getAllCustomers",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Customer"
                  }
                }
              }
            }
          }
        }
      },
      "post": {
        "tags": [
          "customer-controller"
        ],
        "operationId": "addUser",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/CustomerDTO"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/materials/{id}": {
      "get": {
        "tags": [
          "material-controller"
        ],
        "operationId": "getMaterial",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Material"
                }
              }
            }
          }
        }
      }
    },
    "/jobs": {
      "get": {
        "tags": [
          "job-controller"
        ],
        "operationId": "getJobs",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          }
        }
      }
    },
    "/customer/{id}": {
      "get": {
        "tags": [
          "customer-controller"
        ],
        "operationId": "getCustomer",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Customer"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "MaterialDTO": {
        "type": "object",
        "properties": {
          "materialName": {
            "type": "string",
            "minLength": 1
          },
          "unitPrice": {
            "type": "object",
            "properties": {
              "groupingUsed": {
                "type": "boolean"
              },
              "parseIntegerOnly": {
                "type": "boolean"
              },
              "maximumIntegerDigits": {
                "type": "integer",
                "format": "int32"
              },
              "minimumIntegerDigits": {
                "type": "integer",
                "format": "int32"
              },
              "maximumFractionDigits": {
                "type": "integer",
                "format": "int32"
              },
              "minimumFractionDigits": {
                "type": "integer",
                "format": "int32"
              },
              "positivePrefix": {
                "type": "string"
              },
              "positiveSuffix": {
                "type": "string"
              },
              "negativePrefix": {
                "type": "string"
              },
              "negativeSuffix": {
                "type": "string"
              },
              "multiplier": {
                "type": "integer",
                "format": "int32"
              },
              "groupingSize": {
                "type": "integer",
                "format": "int32"
              },
              "decimalSeparatorAlwaysShown": {
                "type": "boolean"
              },
              "parseBigDecimal": {
                "type": "boolean"
              },
              "roundingMode": {
                "type": "string",
                "enum": [
                  "UP",
                  "DOWN",
                  "CEILING",
                  "FLOOR",
                  "HALF_UP",
                  "HALF_DOWN",
                  "HALF_EVEN",
                  "UNNECESSARY"
                ]
              },
              "strict": {
                "type": "boolean"
              },
              "currency": {
                "type": "object",
                "properties": {
                  "currencyCode": {
                    "type": "string"
                  },
                  "numericCode": {
                    "type": "integer",
                    "format": "int32"
                  },
                  "numericCodeAsString": {
                    "type": "string"
                  },
                  "displayName": {
                    "type": "string"
                  },
                  "symbol": {
                    "type": "string"
                  },
                  "defaultFractionDigits": {
                    "type": "integer",
                    "format": "int32"
                  }
                }
              },
              "decimalFormatSymbols": {
                "type": "object",
                "properties": {
                  "zeroDigit": {
                    "type": "string"
                  },
                  "groupingSeparator": {
                    "type": "string"
                  },
                  "decimalSeparator": {
                    "type": "string"
                  },
                  "perMill": {
                    "type": "string"
                  },
                  "percent": {
                    "type": "string"
                  },
                  "digit": {
                    "type": "string"
                  },
                  "patternSeparator": {
                    "type": "string"
                  },
                  "infinity": {
                    "type": "string"
                  },
                  "minusSign": {
                    "type": "string"
                  },
                  "currencySymbol": {
                    "type": "string"
                  },
                  "locale": {
                    "type": "string"
                  },
                  "monetaryGroupingSeparator": {
                    "type": "string"
                  },
                  "naN": {
                    "type": "string"
                  },
                  "monetaryDecimalSeparator": {
                    "type": "string"
                  },
                  "exponentSeparator": {
                    "type": "string"
                  },
                  "internationalCurrencySymbol": {
                    "type": "string"
                  },
                  "currency": {
                    "type": "object",
                    "properties": {
                      "currencyCode": {
                        "type": "string"
                      },
                      "numericCode": {
                        "type": "integer",
                        "format": "int32"
                      },
                      "numericCodeAsString": {
                        "type": "string"
                      },
                      "displayName": {
                        "type": "string"
                      },
                      "symbol": {
                        "type": "string"
                      },
                      "defaultFractionDigits": {
                        "type": "integer",
                        "format": "int32"
                      }
                    }
                  }
                }
              }
            }
          },
          "availableStock": {
            "type": "integer",
            "format": "int32",
            "minimum": 0
          }
        },
        "required": [
          "availableStock",
          "materialName",
          "unitPrice"
        ]
      },
      "Material": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "createdAt": {
            "type": "string",
            "format": "date-time"
          },
          "updatedAt": {
            "type": "string",
            "format": "date-time"
          },
          "materialName": {
            "type": "string"
          },
          "unitPrice": {
            "type": "object",
            "properties": {
              "groupingUsed": {
                "type": "boolean"
              },
              "parseIntegerOnly": {
                "type": "boolean"
              },
              "maximumIntegerDigits": {
                "type": "integer",
                "format": "int32"
              },
              "minimumIntegerDigits": {
                "type": "integer",
                "format": "int32"
              },
              "maximumFractionDigits": {
                "type": "integer",
                "format": "int32"
              },
              "minimumFractionDigits": {
                "type": "integer",
                "format": "int32"
              },
              "positivePrefix": {
                "type": "string"
              },
              "positiveSuffix": {
                "type": "string"
              },
              "negativePrefix": {
                "type": "string"
              },
              "negativeSuffix": {
                "type": "string"
              },
              "multiplier": {
                "type": "integer",
                "format": "int32"
              },
              "groupingSize": {
                "type": "integer",
                "format": "int32"
              },
              "decimalSeparatorAlwaysShown": {
                "type": "boolean"
              },
              "parseBigDecimal": {
                "type": "boolean"
              },
              "roundingMode": {
                "type": "string",
                "enum": [
                  "UP",
                  "DOWN",
                  "CEILING",
                  "FLOOR",
                  "HALF_UP",
                  "HALF_DOWN",
                  "HALF_EVEN",
                  "UNNECESSARY"
                ]
              },
              "strict": {
                "type": "boolean"
              },
              "currency": {
                "type": "object",
                "properties": {
                  "currencyCode": {
                    "type": "string"
                  },
                  "numericCode": {
                    "type": "integer",
                    "format": "int32"
                  },
                  "numericCodeAsString": {
                    "type": "string"
                  },
                  "displayName": {
                    "type": "string"
                  },
                  "symbol": {
                    "type": "string"
                  },
                  "defaultFractionDigits": {
                    "type": "integer",
                    "format": "int32"
                  }
                }
              },
              "decimalFormatSymbols": {
                "type": "object",
                "properties": {
                  "zeroDigit": {
                    "type": "string"
                  },
                  "groupingSeparator": {
                    "type": "string"
                  },
                  "decimalSeparator": {
                    "type": "string"
                  },
                  "perMill": {
                    "type": "string"
                  },
                  "percent": {
                    "type": "string"
                  },
                  "digit": {
                    "type": "string"
                  },
                  "patternSeparator": {
                    "type": "string"
                  },
                  "infinity": {
                    "type": "string"
                  },
                  "minusSign": {
                    "type": "string"
                  },
                  "currencySymbol": {
                    "type": "string"
                  },
                  "locale": {
                    "type": "string"
                  },
                  "monetaryGroupingSeparator": {
                    "type": "string"
                  },
                  "naN": {
                    "type": "string"
                  },
                  "monetaryDecimalSeparator": {
                    "type": "string"
                  },
                  "exponentSeparator": {
                    "type": "string"
                  },
                  "internationalCurrencySymbol": {
                    "type": "string"
                  },
                  "currency": {
                    "type": "object",
                    "properties": {
                      "currencyCode": {
                        "type": "string"
                      },
                      "numericCode": {
                        "type": "integer",
                        "format": "int32"
                      },
                      "numericCodeAsString": {
                        "type": "string"
                      },
                      "displayName": {
                        "type": "string"
                      },
                      "symbol": {
                        "type": "string"
                      },
                      "defaultFractionDigits": {
                        "type": "integer",
                        "format": "int32"
                      }
                    }
                  }
                }
              }
            }
          },
          "availableStock": {
            "type": "integer",
            "format": "int32"
          }
        }
      },
      "CustomerDTO": {
        "type": "object",
        "properties": {
          "customerName": {
            "type": "string"
          },
          "phoneNumber": {
            "type": "integer",
            "format": "int64"
          },
          "address": {
            "type": "string"
          },
          "emailId": {
            "type": "string"
          }
        },
        "required": [
          "address",
          "customerName",
          "emailId",
          "phoneNumber"
        ]
      },
      "Customer": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "createdAt": {
            "type": "string",
            "format": "date-time"
          },
          "updatedAt": {
            "type": "string",
            "format": "date-time"
          },
          "customerName": {
            "type": "string"
          },
          "phoneNumber": {
            "type": "integer",
            "format": "int64"
          },
          "address": {
            "type": "string"
          },
          "emailId": {
            "type": "string"
          }
        }
      }
    }
  }
}