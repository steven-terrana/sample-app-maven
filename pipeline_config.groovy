organization = "organization"

application_environments{
    organization{
        other_val = "something else"
        num = 6
    }
    tenant {
        short_name = "dev"
        long_name = "Development"
    }
    something{
        tenant_config = 11
    }
}

libraries{
    docker{ branch = "testing" }
}