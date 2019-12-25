```
├── Dockerfile                                          # docker config
├── Dockerfile.earth
├── Dockerfile.nap-python-base-image
├── Jenkinsfile                                         # ci config
├── Makefile
├── README.md
├── change_request                                       # change_request application for change order management
│   ├── __init__.py
│   ├── admin.py
│   ├── apps.py
│   ├── data_validator.py                                # api data validator by jsonschema
│   ├── migrations
│   ├── models.py                                        # change_request tables definition and data crud
│   ├── schema.py
│   ├── serializers.py
│   ├── signal_receiver.py                               # define django signal for models crud
│   ├── templates                                        # send order notice email's template which use Jinja
│   │   ├── create_order_notice.html
│   │   └── run_failed_notice.html
│   ├── tests.py
│   ├── urls.py                                          # application urls definition
│   ├── util.py
│   └── views.py                                         # django view takes web request and return web response
├── collection_job
├── device
├── dns
├── dns_job
├── docker-compose.yml
├── manage.py
├── nap_bff                                               # project entry application
│   ├── __init__.py
│   ├── pagination.py
│   ├── routing.py
│   ├── settings.py
│   ├── urls.py                                           # api route entry definition
│   ├── utils.py
│   └── wsgi.py
├── pylint.conf
├── requirements.txt                                      # manage dependency libraries
├── run.sh
├── salt_script
├── saml2                                                 # Authorization and user modules
├── sample.env
├── scheduler                                             # schedule task management
├── setup.sh
├── templates
├── test_nap_bff
├── tools
├── utils
├── workflow                                              # nap workflow module
└── ws_service

```
