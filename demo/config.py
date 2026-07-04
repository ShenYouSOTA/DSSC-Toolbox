"""
FIWARE DSC Demo - 集中配置

所有 Demo 共享的配置项，避免硬编码散落。
"""

import logging
import os
from pathlib import Path

# ============================================================
# 路径
# ============================================================

DEMO_DIR = Path(__file__).parent
SCENARIO_DIR = DEMO_DIR.parent / "DSSC_Tool_Learning" / "DSSC_Minimal_Energy_Scenario"
DATA_DIR = SCENARIO_DIR / "data"
METADATA_DIR = SCENARIO_DIR / "metadata"
OPENAPI_DIR = SCENARIO_DIR / "mock-api"
LOG_DIR = DEMO_DIR / "logs"

# ============================================================
# Provider 配置
# ============================================================

PROVIDER_NAME = "Energy Data Provider Ltd."
DATASET_ID = "building-energy-hourly-v1"
PROVIDER_DID = "did:web:energy-provider.example.org"

# ============================================================
# JWT / Auth
# ============================================================

JWT_SECRET = os.environ.get("DEMO_JWT_SECRET", "dssc-demo-secret-key-change-in-production")
JWT_ALGORITHM = "HS256"
JWT_EXPIRY_HOURS = int(os.environ.get("DEMO_JWT_EXPIRY_HOURS", "2"))

# Demo 客户端凭证
DEMO_CLIENTS = {
    "city-analytics-lab": {
        "secret": "consumer-secret-123",
        "role": "consumer",
        "name": "City Analytics Lab",
        "did": "did:web:city-analytics-lab.example.org",
    }
}

DEFAULT_CLIENT_ID = "city-analytics-lab"
DEFAULT_CLIENT_SECRET = "consumer-secret-123"
CONSUMER_DID = "did:web:city-analytics-lab.example.org"

# ============================================================
# Mock Server
# ============================================================

MOCK_HOST = os.environ.get("DEMO_MOCK_HOST", "0.0.0.0")
MOCK_PORT = int(os.environ.get("DEMO_MOCK_PORT", "8000"))

# ============================================================
# Real Cluster (port-forward 端口映射)
# ============================================================

KUBECONFIG = os.environ.get("KUBECONFIG", "/tmp/k3s.yaml")

CLUSTER_PORTS = {
    "provider-keycloak": 8443,
    "consumer-keycloak": 8444,
    "provider-verifier": 8445,
    "provider-scorpio": 8446,
    "provider-tmf-api": 8447,
    "provider-til": 8448,
    "provider-dashboard": 8449,
    "provider-marketplace": 8450,
    "ta-tir": 8451,
}

# Keycloak 配置 (真实集群)
KC_REALM = os.environ.get("DEMO_KC_REALM", "test-realm")
KC_CLIENT_ID = os.environ.get("DEMO_KC_CLIENT_ID", "account-console")
KC_USERNAME = os.environ.get("DEMO_KC_USERNAME", "employee")
KC_PASSWORD = os.environ.get("DEMO_KC_PASSWORD", "test")

# ============================================================
# Logging
# ============================================================


def setup_logging(name: str, level: int = logging.INFO) -> logging.Logger:
    """统一日志配置"""
    logger = logging.getLogger(name)
    if not logger.handlers:
        handler = logging.StreamHandler()
        formatter = logging.Formatter(
            "%(asctime)s [%(name)s] %(levelname)s: %(message)s",
            datefmt="%H:%M:%S",
        )
        handler.setFormatter(formatter)
        logger.addHandler(handler)
    logger.setLevel(level)
    return logger
