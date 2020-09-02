<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class GetTablesExtRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'catalog',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'database',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'tableNamePattern',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'requestedFields',
            'isRequired' => true,
            'type' => TType::I32,
        ),
        5 => array(
            'var' => 'limit',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        6 => array(
            'var' => 'processorCapabilities',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        7 => array(
            'var' => 'processorIdentifier',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $catalog = null;
    /**
     * @var string
     */
    public $database = null;
    /**
     * @var string
     */
    public $tableNamePattern = null;
    /**
     * @var int
     */
    public $requestedFields = null;
    /**
     * @var int
     */
    public $limit = null;
    /**
     * @var string[]
     */
    public $processorCapabilities = null;
    /**
     * @var string
     */
    public $processorIdentifier = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['catalog'])) {
                $this->catalog = $vals['catalog'];
            }
            if (isset($vals['database'])) {
                $this->database = $vals['database'];
            }
            if (isset($vals['tableNamePattern'])) {
                $this->tableNamePattern = $vals['tableNamePattern'];
            }
            if (isset($vals['requestedFields'])) {
                $this->requestedFields = $vals['requestedFields'];
            }
            if (isset($vals['limit'])) {
                $this->limit = $vals['limit'];
            }
            if (isset($vals['processorCapabilities'])) {
                $this->processorCapabilities = $vals['processorCapabilities'];
            }
            if (isset($vals['processorIdentifier'])) {
                $this->processorIdentifier = $vals['processorIdentifier'];
            }
        }
    }

    public function getName()
    {
        return 'GetTablesExtRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->catalog);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->database);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tableNamePattern);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->requestedFields);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->limit);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->processorCapabilities = array();
                        $_size903 = 0;
                        $_etype906 = 0;
                        $xfer += $input->readListBegin($_etype906, $_size903);
                        for ($_i907 = 0; $_i907 < $_size903; ++$_i907) {
                            $elem908 = null;
                            $xfer += $input->readString($elem908);
                            $this->processorCapabilities []= $elem908;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->processorIdentifier);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('GetTablesExtRequest');
        if ($this->catalog !== null) {
            $xfer += $output->writeFieldBegin('catalog', TType::STRING, 1);
            $xfer += $output->writeString($this->catalog);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->database !== null) {
            $xfer += $output->writeFieldBegin('database', TType::STRING, 2);
            $xfer += $output->writeString($this->database);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tableNamePattern !== null) {
            $xfer += $output->writeFieldBegin('tableNamePattern', TType::STRING, 3);
            $xfer += $output->writeString($this->tableNamePattern);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->requestedFields !== null) {
            $xfer += $output->writeFieldBegin('requestedFields', TType::I32, 4);
            $xfer += $output->writeI32($this->requestedFields);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->limit !== null) {
            $xfer += $output->writeFieldBegin('limit', TType::I32, 5);
            $xfer += $output->writeI32($this->limit);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->processorCapabilities !== null) {
            if (!is_array($this->processorCapabilities)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('processorCapabilities', TType::LST, 6);
            $output->writeListBegin(TType::STRING, count($this->processorCapabilities));
            foreach ($this->processorCapabilities as $iter909) {
                $xfer += $output->writeString($iter909);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->processorIdentifier !== null) {
            $xfer += $output->writeFieldBegin('processorIdentifier', TType::STRING, 7);
            $xfer += $output->writeString($this->processorIdentifier);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
